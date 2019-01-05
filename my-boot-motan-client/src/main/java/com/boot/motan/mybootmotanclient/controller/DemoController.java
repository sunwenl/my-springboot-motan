package com.boot.motan.mybootmotanclient.controller;

import com.boot.motan.mybootmotan.IMotanDemo;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：SunWenLong
 * @Date ：2019/1/4
 */
@RestController
public class DemoController {
    @MotanReferer
    private IMotanDemo motanDemo;

    @RequestMapping("/say/{msg}")
    public String say(@PathVariable String msg) {
        return motanDemo.say(msg);
    }
}
