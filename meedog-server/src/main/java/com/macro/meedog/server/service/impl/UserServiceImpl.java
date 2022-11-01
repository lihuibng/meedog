package com.macro.meedog.server.service.impl;

import com.macro.meedog.common.date.DateUtil;
import com.macro.meedog.common.exception.Asserts;
import com.macro.meedog.common.leaf.IDGenerator;
import com.macro.meedog.mapper.*;
import com.macro.meedog.model.*;
import com.macro.meedog.security.util.CryptUtil;
import com.macro.meedog.security.util.JwtTokenUtil;
import com.macro.meedog.server.domain.*;
import com.macro.meedog.server.service.MailService;
import com.macro.meedog.server.service.UserCacheService;
import com.macro.meedog.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 会员管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final int MAX_RANDOM_NUM = 6;
    private final int MAX_MAIL_SENT_COUNT = 2;
    @Autowired
    IDGenerator idGen;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserLevelMapper userLevelMapper;
    @Autowired
    private UserBasicInfoMapper userBasicInfoMapper;
    @Autowired
    private UserInvitationMapper userInvitationMapper;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private UserIdentifyMapper userIdentifyMapper;
    @Autowired
    private UserCacheService userCacheService;
    @Autowired
    private MailService mailService;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public User getByUsername(String username) {
        User user = userCacheService.getUser(username);
        if (user != null) {
            return user;
        }
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username)
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            user = userList.get(0);
            userCacheService.setUser(user);
            return user;
        }
        return null;
    }

    @Override
    public User getByEmail(String email) {
        User user = userCacheService.getUser(email);
        if (user != null) {
            return user;
        }
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(email)
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            user = userList.get(0);
            userCacheService.setUser(user);
            return user;
        }
        return null;
    }

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void register(String username, String password, String email,
                         String authCode) {
        if (!verifyAuthCode(authCode.trim(), email)) {
            Asserts.fail("验证码错误");
        }
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username)
                .andStatusEqualTo(ItemStatus.ENABLED);
        example.or(example.createCriteria().andEmailEqualTo(email)
                .andStatusEqualTo(ItemStatus.ENABLED));
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该用户已经存在");
        }
        Long uid = idGen.generate();
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setUid(uid);
        user.setStatus(ItemStatus.ENABLED);
        user.setCreateTime(new Date());
        user.setModifiedTime(new Date());
        UserLevelExample levelExample = new UserLevelExample();
        levelExample.createCriteria().andStatusEqualTo(ItemStatus.ENABLED);
        List<UserLevel> userLevelList = userLevelMapper.selectByExample(levelExample);
        if (!CollectionUtils.isEmpty(userLevelList)) {
            user.setUserLevelId(userLevelList.get(0).getId());
        } else {
            UserLevel userLevel = new UserLevel();
            userLevel.setUid(uid);
            userLevel.setStatus(ItemStatus.ENABLED);
            userLevel.setCreateTime(new Date());
            userLevel.setModifiedTime(new Date());
            userLevelMapper.insert(userLevel);
        }
        UserBasicInfoExample userBasicInfoExample = new UserBasicInfoExample();
        userBasicInfoExample.createCriteria().andUidEqualTo(uid)
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> userBasicInfoList = userBasicInfoMapper.selectByExample(userBasicInfoExample);
        if (!CollectionUtils.isEmpty(userBasicInfoList)) {
            user.setUserBasicInfoId(userBasicInfoList.get(0).getId());
        } else {
            UserBasicInfo userBasicInfo = new UserBasicInfo();
            userBasicInfo.setUid(uid);
            userBasicInfo.setStatus(ItemStatus.ENABLED);
            userBasicInfo.setCreateTime(new Date());
            userBasicInfo.setModifiedTime(new Date());
            userBasicInfoMapper.insert(userBasicInfo);
        }
        userMapper.insert(user);
        user.setPassword(null);
    }
    public ID2Province getProvinceById(String id) {
        ProvinceExample provinceExample = new ProvinceExample();
        provinceExample.createCriteria().andCodeEqualTo(id.substring(0,2));
        List<Province> provinceList = provinceMapper.selectByExample(provinceExample);
        String province = provinceList.get(0).getName();
        CityExample cityExample = new CityExample();
        cityExample.createCriteria().andCodeEqualTo(id.substring(0,4))
                .andProvincecodeEqualTo(id.substring(0,2));
        List<City> cityList = cityMapper.selectByExample(cityExample);
        String city = cityList.get(0).getName();
        return new ID2Province(id, province, city);
    }

    @Override
    public void register(RegisterInfo registerInfo) {
        if (!verifyAuthCode(registerInfo.getAuthCode().trim(), registerInfo.getEmail())) {
            Asserts.fail("验证码错误");
        }
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(registerInfo.getUsername())
                .andStatusEqualTo(ItemStatus.ENABLED);
        example.or(example.createCriteria().andEmailEqualTo(registerInfo.getEmail())
                .andStatusEqualTo(ItemStatus.ENABLED));
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该用户已经存在");
        }
        Long uid = idGen.generate();
        User user = new User();
        user.setUsername(registerInfo.getUsername());
        user.setEmail(registerInfo.getEmail());
        user.setPassword(passwordEncoder.encode(registerInfo.getPassword()));
        user.setUid(uid);
        user.setStatus(ItemStatus.ENABLED);
        user.setCreateTime(new Date());
        user.setModifiedTime(new Date());
        UserLevelExample levelExample = new UserLevelExample();
        levelExample.createCriteria().andDefaultStatusEqualTo(1);
        List<UserLevel> userLevelList = userLevelMapper.selectByExample(levelExample);
        if (!CollectionUtils.isEmpty(userLevelList)) {
            user.setUserLevelId(userLevelList.get(0).getId());
        }
        UserBasicInfoExample userBasicInfoExample = new UserBasicInfoExample();
        userBasicInfoExample.createCriteria().andUidEqualTo(uid);
        List<UserBasicInfo> userBasicInfoList = userBasicInfoMapper.selectByExample(userBasicInfoExample);
        if (!CollectionUtils.isEmpty(userBasicInfoList)) {
            user.setUserBasicInfoId(userBasicInfoList.get(0).getId());
        } else {
            UserBasicInfo userBasicInfo = new UserBasicInfo();
            userBasicInfo.setUid(uid);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = simpleDateFormat.parse(registerInfo.getRealBirthday());
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.warn("注册异常: ", e.getMessage());
                return;
            }
            LOGGER.info("注册信息: ", registerInfo.toString());
            LocalDate local = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            userBasicInfo.setBirthday(date);
            userBasicInfo.setZodiac(DateUtil.getZodiac(local.getYear(),
                    local.getMonth().getValue(), local.getDayOfMonth()));
            userBasicInfo.setConstellation(DateUtil.getConstellation(local.getMonth().getValue(),
                    local.getDayOfMonth()));
            ID2Province id2Province = getProvinceById(registerInfo.getIdCard6th());
            userBasicInfo.setBirthCountry(id2Province.getCountry());
            userBasicInfo.setBirthProvince(id2Province.getProvince());
            userBasicInfo.setBirthCity(id2Province.getCity());
            userBasicInfo.setStatus(ItemStatus.ENABLED);
            userBasicInfo.setCreateTime(new Date());
            userBasicInfo.setModifiedTime(new Date());
            userBasicInfoMapper.insert(userBasicInfo);
        }
        UserIdentifyExample userIdentifyExample = new UserIdentifyExample();
        userIdentifyExample.createCriteria().andUidEqualTo(uid);
        List<UserIdentify> userIdentifyList = userIdentifyMapper.selectByExample(userIdentifyExample);
        if (CollectionUtils.isEmpty(userIdentifyList)) {
            UserIdentify userIdentify = new UserIdentify();
            userIdentify.setUid(uid);
            userIdentify.setName(registerInfo.getRealname());
            userIdentify.setIdNumber(registerInfo.getIdCard6th() + registerInfo.getIdCardBirthday());
            userIdentify.setStatus(ItemStatus.ENABLED);
            userIdentify.setCreateTime(new Date());
            userIdentify.setModifiedTime(new Date());
            userIdentifyMapper.insert(userIdentify);
        }
        userMapper.insert(user);
        user.setPassword(null);
    }

    @Override
    public String generateAuthCode(String email) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < MAX_RANDOM_NUM; i++) {
            sb.append(random.nextInt(10));
        }
        int mailSentCount = 0;
        while (mailSentCount++ < MAX_MAIL_SENT_COUNT) {
            if (mailService.sendMail(email, sb.toString())) {
                userCacheService.setAuthCode(email, sb.toString());
                break;
            }
        }
        return sb.toString();
    }


    @Override
    public List<UserInvitation> getInvitations(String uid) {
        UserExample example = new UserExample();
        example.createCriteria().andUidEqualTo(Long.parseLong(uid)).andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该账号不存在");
            return new ArrayList<UserInvitation>();
        } else {
            UserInvitationExample userInvitationExample = new UserInvitationExample();
            userInvitationExample.createCriteria().andUidEqualTo(Long.parseLong(uid))
                    .andStatusEqualTo(ItemStatus.ENABLED);
            List<UserInvitation> userInvitationList = userInvitationMapper.selectByExample(userInvitationExample);
            if (!CollectionUtils.isEmpty(userInvitationList)) {
                return userInvitationList;
            }
        }
        return new ArrayList<UserInvitation>();
    }

    @Override
    public void updateInvitation(String email, String uid) {
        UserExample example = new UserExample();
        example.createCriteria().andUidEqualTo(Long.parseLong(uid));
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该账号不存在");
        } else {
            String authCode = generateAuthCode(email);
            UserInvitationExample userInvitationExample = new UserInvitationExample();
            userInvitationExample.createCriteria().andUidEqualTo(Long.parseLong(uid))
                    .andInvitedEmailEqualTo(email).andStatusEqualTo(ItemStatus.ENABLED);
            List<UserInvitation> userInvitationList = userInvitationMapper.selectByExample(userInvitationExample);
            if (CollectionUtils.isEmpty(userInvitationList)) {
                UserInvitation userInvitation = new UserInvitation();
                userInvitation.setUid(Long.parseLong(uid));
                userInvitation.setInvitedEmail(email);
                userInvitation.setAuthCode(authCode);
                userInvitation.setStatus(ItemStatus.ENABLED);
                userInvitation.setCreateTime(new Date());
                userInvitation.setModifiedTime(new Date());
                userInvitationMapper.insert(userInvitation);
            } else {
                UserInvitation userInvitation = userInvitationList.get(0);
                int mailSentCount = 0;
                while (mailSentCount++ < MAX_MAIL_SENT_COUNT) {
                    if (mailService.sendMail(userInvitation.getInvitedEmail(), userInvitation.getAuthCode())) {
                        userCacheService.setAuthCode(userInvitation.getInvitedEmail(), userInvitation.getAuthCode());
                        break;
                    }
                }
                Asserts.fail("该账号已经发送过邀请码");
            }
        }
    }

    @Override
    public void updatePassword(String email, String password, String authCode) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(email).andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该账号不存在");
        }
        if (!verifyAuthCode(authCode.trim(), email)) {
            Asserts.fail("验证码错误");
        }
        User user = userList.get(0);
        user.setPassword(passwordEncoder.encode(password));
        userMapper.updateByPrimaryKeySelective(user);
        userCacheService.delUser(user.getId());
    }

    @Override
    public void updateInfo(String uid, String username, String phone) {
        UserExample example = new UserExample();
        example.createCriteria().andUidEqualTo(Long.parseLong(uid))
                .andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该账号不存在");
        }
        User user = userList.get(0);
        user.setUsername(username);
        user.setPhone(phone);
        userMapper.updateByPrimaryKeySelective(user);
        userCacheService.delUser(user.getId());
    }

    @Override
    public User getCurrentUser() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        UserDetail userDetail = (UserDetail) auth.getPrincipal();
        return userDetail.getUser();
    }

    @Override
    public UserDetail loadUserByUsername(String username) {
        User user = getByUsername(username);
        if (user != null) {
            return new UserDetail(user);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public User getByOpenid(String openid) {
        User user = userCacheService.getUser(openid);
        if (user != null) {
            return user;
        }
        UserExample example = new UserExample();
        example.createCriteria().andOpenidEqualTo(openid).andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            user = userList.get(0);
            userCacheService.setUser(user);
            return user;
        }
        return null;
    }

    @Override
    public LoginResult login(String openid) {
        try {
            UserDetail userDetail = loadUserByOpenid(openid);
            if (userDetail == null) {
                return null;
            }
            long uid = userDetail.getUser().getUid();
            String token = CryptUtil.encode(jwtTokenUtil.generateToken(userDetail));
            LoginResult loginResult = new LoginResult(uid, token);
            userCacheService.setUserToken(uid, token);
            return loginResult;
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return null;
    }

    @Override
    public UserDetail loadUserByOpenid(String openid) {
        User user = getByOpenid(openid);
        if (user != null) {
            return new UserDetail(user);
        }
        return null;
    }

    @Override
    public void register(String openid, String sessionKey) {
        UserExample example = new UserExample();
        example.createCriteria().andOpenidEqualTo(openid).andStatusEqualTo(ItemStatus.ENABLED);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            Asserts.fail("该用户已经存在");
        }
        Long uid = idGen.generate();
        User user = new User();
        user.setOpenid(openid);
        user.setUsername(openid);
        user.setSessionKey(sessionKey);
        user.setPassword(passwordEncoder.encode(openid));
        user.setUid(uid);
        user.setStatus(ItemStatus.ENABLED);
        user.setCreateTime(new Date());
        user.setModifiedTime(new Date());
        UserLevelExample levelExample = new UserLevelExample();
        levelExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserLevel> userLevelList = userLevelMapper.selectByExample(levelExample);
        if (!CollectionUtils.isEmpty(userLevelList)) {
            user.setUserLevelId(userLevelList.get(0).getId());
        }
        UserBasicInfoExample userBasicInfoExample = new UserBasicInfoExample();
        userBasicInfoExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserBasicInfo> userBasicInfoList = userBasicInfoMapper.selectByExample(userBasicInfoExample);
        if (!CollectionUtils.isEmpty(userBasicInfoList)) {
            user.setUserBasicInfoId(userBasicInfoList.get(0).getId());
        }
        userMapper.insert(user);
    }

    @Override
    public LoginResult login(String username, String password) {
        try {
            UserDetail userDetail = loadUserByUsername(username);
            if (!passwordEncoder.matches(password.trim(), userDetail.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null, userDetail.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            long uid = userDetail.getUser().getUid();
            String token = CryptUtil.encode(jwtTokenUtil.generateToken(userDetail));
            LoginResult loginResult = new LoginResult(uid, token);
            userCacheService.setUserToken(uid, token);
            return loginResult;
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return null;
    }

    @Override
    public String refreshToken(String token) {
        return CryptUtil.encode(jwtTokenUtil.refreshHeadToken(CryptUtil.decode(token)));
    }

    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String email) {
        if (StringUtils.isEmpty(authCode)) {
            return false;
        }
        String realAuthCode = userCacheService.getAuthCode(email);
        return authCode.equals(realAuthCode);
    }
}
