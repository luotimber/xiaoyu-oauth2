package com.xiaoyu.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoyu
 * @date 2019/1/17 10:06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/info")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}
