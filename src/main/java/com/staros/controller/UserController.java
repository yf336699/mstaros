package com.staros.controller;


import com.staros.domain.User;
import com.staros.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl service;

    @GetMapping
    public List<User> query(){
        return service.list();
    }
}

