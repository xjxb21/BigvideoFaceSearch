package com.bigvideo.faces.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiao on 2016/6/1.
 */

@RestController
@RequestMapping(value = "Search")
public class uploadController {

    @RequestMapping(value = "uploadImg", method = RequestMethod.POST)
    public String uploadImg() {

        return "uploadContorller...";
    }
}
