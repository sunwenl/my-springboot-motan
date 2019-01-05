package com.bootmotan.mybootmotanserver.server;

import com.boot.motan.mybootmotan.IMotanDemo;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * @Author ：SunWenLong
 * @Date ：2019/1/4
 */
@MotanService
public class MotanDemoService implements IMotanDemo {
    @Override
    public String say(String msg) {
        return "hello world";
    }
}
