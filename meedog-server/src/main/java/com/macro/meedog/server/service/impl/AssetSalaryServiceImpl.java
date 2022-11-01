package com.macro.meedog.server.service.impl;

import com.macro.meedog.mapper.UserAssetSalaryMapper;
import com.macro.meedog.model.UserAssetSalary;
import com.macro.meedog.model.UserAssetSalaryExample;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.service.AssetSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;


/**
 * @author "xxxxxx"
 * @modified 2021/3/29 11:21 下午
 */
@Service
public class AssetSalaryServiceImpl implements AssetSalaryService {
    @Autowired
    private UserAssetSalaryMapper userAssetSalaryMapper;

    @Override
    public List<UserAssetSalary> getAssetSalarys(Long uid) {
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        return userAssetSalaryMapper.selectByExample(example);
    }

    @Override
    public int insertAssetSalary(UserAssetSalary u) {
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andUidEqualTo(u.getUid()).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserAssetSalary> userAssetSalaryList = userAssetSalaryMapper.selectByExample(example);
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userAssetSalaryList.isEmpty()) {
            return userAssetSalaryMapper.updateByExampleSelective(u, example);
        } else {
            u.setCreateTime(new Date());
            return userAssetSalaryMapper.insert(u);
        }
    }

    @Override
    public int updateAssetSalary(UserAssetSalary u) {
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andUidEqualTo(u.getUid()).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserAssetSalary> userAssetSalaryList = userAssetSalaryMapper.selectByExample(example);
        u.setStatus(ItemStatus.ENABLED);
        u.setModifiedTime(new Date());
        if (!userAssetSalaryList.isEmpty()) {
            return userAssetSalaryMapper.updateByExampleSelective(u, example);
        } else {
            u.setCreateTime(new Date());
            return userAssetSalaryMapper.insert(u);
        }
    }

    @Override
    public UserAssetSalary getAssetSalaryById(Long id) {
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andUidEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserAssetSalary> uAssetSalarys = userAssetSalaryMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(uAssetSalarys)) {
            return uAssetSalarys.get(0);
        }
        return null;
    }

    @Override
    public int deleteAssetSalary(Long id) {
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        UserAssetSalary userAssetSalary = new UserAssetSalary();
        userAssetSalary.setStatus(ItemStatus.DELETED);
        return userAssetSalaryMapper.updateByExampleSelective(userAssetSalary, example);
    }

    @Override
    public int clear(Long uid) {
        int count = 0;
        UserAssetSalaryExample example = new UserAssetSalaryExample();
        example.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserAssetSalary> uAssetSalarys = userAssetSalaryMapper.selectByExample(example);
        for (UserAssetSalary u : uAssetSalarys) {
            u.setStatus(ItemStatus.DELETED);
            count += userAssetSalaryMapper.updateByExampleSelective(u, example);
        }
        return count;
    }
}

