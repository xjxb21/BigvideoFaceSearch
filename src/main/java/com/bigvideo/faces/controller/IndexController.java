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
        return "pages/searchFace1VN";
    }

    //域名访问响应, index首页
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index_Html() {
        return "pages/searchFace1VN";
    }

}
