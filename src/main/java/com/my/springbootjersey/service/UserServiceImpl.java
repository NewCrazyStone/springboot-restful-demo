package com.my.springbootjersey.service;


import com.my.springbootjersey.mapper.UserMapper;
import com.my.springbootjersey.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO UserServiceImpl
 *
 * @author ChenWei
 * @date 2018/7/13 14:14
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
