package com.bigvideo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiao on 2016/5/23.
 */

@RestController
public class Demo {

    @RequestMapping(value = "/demo")
    public String demo(){

        return "this is a demo";
    }
}
