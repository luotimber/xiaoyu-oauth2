package com.xiaoyu.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoyu
 * @date 2019/1/16 10:38
 */
@RestController
@RequestMapping("api")
public class TestController {

    @RequestMapping(value = "test",method = {RequestMethod.POST,RequestMethod.GET})
    public String test() {
        return "hello xiaoyu";
    }
}
