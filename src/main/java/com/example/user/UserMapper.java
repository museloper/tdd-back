package com.example.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserVO user);

    UserVO selectUserByUsername(String username);
}
