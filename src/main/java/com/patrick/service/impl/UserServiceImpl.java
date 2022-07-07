package com.patrick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.patrick.entity.User;
import com.patrick.mapper.UserMapper;
import com.patrick.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
