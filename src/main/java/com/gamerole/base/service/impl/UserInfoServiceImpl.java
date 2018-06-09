package com.gamerole.base.service.impl;

import com.gamerole.base.core.config.ServiceException;
import com.gamerole.base.core.universal.AbstractService;
import com.gamerole.base.dao.UserInfoMapper;
import com.gamerole.base.model.UserInfo;
import com.gamerole.base.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(String id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if (userInfo == null) {
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }




}
