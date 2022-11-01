package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.User;
import com.macro.meedog.model.UserInvitation;
import com.macro.meedog.server.domain.Invitation;
import com.macro.meedog.server.domain.LoginResult;
import com.macro.meedog.server.domain.RegisterInfo;
import com.macro.meedog.server.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员登录注册管理Controller
 * Created by macro on 2018/8/3.
 */
@Controller
@Api(tags = "UserController", description = "会员登录注册管理")
@RequestMapping("/user/sso")
public class UserController {
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private UserService userService;

    @ApiOperation("会员注册")
    @RequestMapping(value = "/regis", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String email,
                                 @RequestParam String authCode) {
        userService.register(username, password, email, authCode);
        return CommonResult.success(null, "注册成功");
    }

    @ApiOperation("会员注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestBody RegisterInfo registerInfo) {
        userService.register(registerInfo);
        return CommonResult.success(null, "注册成功");
    }

    @ApiOperation("会员登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password) {
        LoginResult loginResult = userService.login(username, password);
        if (loginResult == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", loginResult.getToken());
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("uid", Long.toString(loginResult.getUid()));
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取会员信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult info(Principal principal) {
        if (principal == null) {
            return CommonResult.unauthorized(null);
        }
        User user = userService.getCurrentUser();
        return CommonResult.success(user);
    }

    @ApiOperation("获取会员信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestParam String username,
                               @RequestParam String uid,
                               @RequestParam String mobile) {
        userService.updateInfo(uid, username, mobile);
        return CommonResult.success(uid);
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String email) {
        String authCode = userService.generateAuthCode(email);
        return CommonResult.success(authCode, "获取验证码成功");
    }

    @ApiOperation("获取邀请码")
    @RequestMapping(value = "/getInvitationCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getInvitationCode(@RequestParam String email, @RequestParam String uid) {
        userService.updateInvitation(email, uid);
        return CommonResult.success(null, "获取验证码成功");
    }

    @ApiOperation("获取邀请人列表")
    @RequestMapping(value = "/getInvitations", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getInvitations(@RequestParam String uid) {
        List<UserInvitation> userInvitations = userService.getInvitations(uid);
        ArrayList<Invitation> invitationList = new ArrayList<Invitation>();
        for (UserInvitation k : userInvitations) {
            invitationList.add(new Invitation(k.getInvitedEmail(), k.getAuthCode()));
        }
        return CommonResult.success(invitationList, "获取验证码成功");
    }

    @ApiOperation("修改密码")
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String email,
                                       @RequestParam String password,
                                       @RequestParam String authCode) {
        userService.updatePassword(email, password, authCode);
        return CommonResult.success(null, "密码修改成功");
    }


    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult refreshToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String refreshToken = userService.refreshToken(token);
        if (refreshToken == null) {
            return CommonResult.failed("token已经过期！");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }
}
