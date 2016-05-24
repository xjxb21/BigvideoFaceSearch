package com.bigvideo.faces;

import com.bigvideo.demo.beans.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiao on 2016/5/24.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }
}
