package com.bigvideo.faces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiao on 2016/5/24.
 */
@Controller
public class IndexController {

    //域名访问响应
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "pages/index";
    }
}
