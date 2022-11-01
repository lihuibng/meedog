package com.macro.meedog.server.service.impl;


import com.macro.meedog.mapper.UserWeiboCommentMapper;
import com.macro.meedog.mapper.UserWeiboMapper;
import com.macro.meedog.model.UserWeibo;
import com.macro.meedog.model.UserWeiboComment;
import com.macro.meedog.model.UserWeiboCommentExample;
import com.macro.meedog.server.dao.WeiboCommentDao;
import com.macro.meedog.server.domain.ItemStatus;
import com.macro.meedog.server.domain.vo.UserWeiboVo;
import com.macro.meedog.server.domain.vo.WeiboCommentVo;
import com.macro.meedog.server.service.WeiboCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class WeiboCommentServiceImpl implements WeiboCommentService {
    @Autowired
    UserWeiboCommentMapper userWeiboCommentMapper;

    @Autowired
    UserWeiboMapper userWeiboMapper;

    @Autowired
    WeiboCommentDao weiboCommentDao;

    @Override
    public int add(WeiboCommentVo commentVo) {
        if (commentVo.getCommentId() == null) {
            commentVo.setCommentId("0");
        }
        if (commentVo.getCreateTime() == null) {
            commentVo.setCreateTime(new Date());
        }
        commentVo.setModifiedTime(new Date());
        commentVo.setStatus(ItemStatus.ENABLED);
        UserWeiboComment userWeiboComment = WeiboCommentVo.viewToModel(commentVo);
        int count = userWeiboCommentMapper.insert(userWeiboComment);
        if (count > 0) {
            UserWeibo userWeibo = userWeiboMapper.selectByPrimaryKey(userWeiboComment.getWeiboId());
            userWeibo.setCommentCount(userWeibo.getCommentCount() + 1);
            userWeiboMapper.updateByPrimaryKey(userWeibo);
        }
        return count;
    }

    @Override
    public int delete(Long id) {
        return userWeiboCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<UserWeiboComment> list(Long weiboId, Long commentId, Integer pageNum, Integer pageSize) {
        return weiboCommentDao.getWeiboCommentList(weiboId.intValue(), commentId.intValue(), pageNum, pageSize);

    }

    @Override
    public UserWeiboComment detail(Long id) {
        UserWeiboCommentExample commentExample = new UserWeiboCommentExample();
        commentExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(ItemStatus.ENABLED);
        List<UserWeiboComment> userWeiboList = userWeiboCommentMapper.selectByExample(commentExample);
        if (!CollectionUtils.isEmpty(userWeiboList)) {
            return userWeiboList.get(0);
        } else {
            return new UserWeiboComment();
        }
    }

    @Override
    public int clear(Long uid) {
        UserWeiboCommentExample userWeiboCommentExample = new UserWeiboCommentExample();
        userWeiboCommentExample.createCriteria().andUidEqualTo(uid).andStatusEqualTo(ItemStatus.ENABLED);
        return userWeiboCommentMapper.deleteByExample(userWeiboCommentExample);
    }
}
