package com.xiaoyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xiaoyu
 * @date 2019/1/22 16:34
 */
@RestController
public class LoginController {

    @GetMapping("/authentication/require")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
