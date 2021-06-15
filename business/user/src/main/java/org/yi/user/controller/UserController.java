package org.yi.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yi.user.mapper.UserMapper;
import org.yi.user.module.entity.UserEntity;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/15 17:24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("")
    public UserEntity selectOne(Long id) {
        return null;
    }
}
