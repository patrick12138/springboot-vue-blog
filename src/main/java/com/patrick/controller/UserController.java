package com.patrick.controller;

import com.patrick.entity.User;
import com.patrick.service.UserService;
import com.patrick.vo.ResultVo;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public ResultVo index() {
        User user = userService.getById(1L);
        return ResultVo.succ(user);
    }

    @PostMapping("/save")
    public ResultVo test(@Validated @RequestBody User user) {
        return ResultVo.succ(user);
    }
}
