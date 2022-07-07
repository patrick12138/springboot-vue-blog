package com.patrick;

import com.patrick.service.UserService;
import com.patrick.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueblogApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testUser() {
        System.out.println(userService.getById(1));
    }

    @Test
    void contextLoads() {
    }

}
