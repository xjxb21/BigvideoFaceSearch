package com.bigvideo.demo.controller;

import com.bigvideo.demo.beans.DbInfo;
import com.bigvideo.demo.beans.Person;
import com.bigvideo.demo.service.DemoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by xiao on 2016/5/23.
 */

@Controller
@SessionAttributes()
public class ThymeleafDemo {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/demoThymeleaf")
    public String demoThymeleaf(Model model) {
        Person single = new Person("bigvideo", 2);
        model.addAttribute("single", single);
        return "demopage/ThymeleafDemoHtml";
    }

    @RequestMapping(value = "/TestConnection")
    public String testConnection(Model model) {
        String dbSysTime = demoService.getDbSysTime();
        DbInfo dbInfo = new DbInfo();
        dbInfo.setDbDate(dbSysTime);
        model.addAttribute("dbInfo", dbInfo);
        return "demopage/JDBCdemo";
    }

    @RequestMapping(value = "/mvcConfig")
    public String mvcConfig(Model model){
        model.addAttribute("user", "zhangshan");
        return "demopage/webmvccfg";
    }
}
