package com.example.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.example.TddBackApplication;

@Transactional
@SpringBootTest(classes = TddBackApplication.class)
@ActiveProfiles("test")
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void 사용자등록_성공() {
        // given
        UserVO user = new UserVO(null, "jisu", "1234");

        // when
        userService.registerUser(user);

        // then
        UserVO savedUser = userMapper.selectUserByUsername("jisu");
        
        assertNotNull(savedUser);
        assertEquals("jisu", savedUser.getUsername());
    }
}