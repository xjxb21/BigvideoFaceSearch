package com.bigvideo.demo.controller;

import com.bigvideo.demo.beans.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xiao on 2016/5/23.
 */

@Controller
public class ThymeleafDemo {

    @RequestMapping(value = "/demoThymeleaf")
    public String demoThymeleaf(Model model) {
        Person single = new Person("bigvideo", 2);
        model.addAttribute("single", single);
        //map.put("single", single);
        return "index2";
    }
}
