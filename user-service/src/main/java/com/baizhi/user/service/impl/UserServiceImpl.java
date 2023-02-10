package com.baizhi.user.service.impl;

import com.baizhi.user.entity.User;
import com.baizhi.user.mapper.UserMapper;
import com.baizhi.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryById(Long id) {
        System.out.println("UserServiceImpl.queryById");
        return userMapper.findUserById(id);
    }
}