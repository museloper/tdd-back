package com.example.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int registerUser(UserVO user) {
        return userMapper.insertUser(user);
    }
}
