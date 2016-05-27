package com.bigvideo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiao on 2016/5/23.
 */

@RestController
public class Demo {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(){
        System.out.println("hello123");
        return "this is a demo";
    }
}
