package com.bigvideo.faces.controller;

import com.bigvideo.faces.service.upload.TargetImgImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiao on 2016/6/3.
 * 图片上传, 返回JSON结果
 */
@RestController
//没有扫描包引发这个问题？？？
public class UploadController {

    @Autowired
    TargetImgImpl targetimg;

    /**
     * 1比N 上传人脸图片及过滤参数
     */
    @RequestMapping(value = "/searchFace1VN", method = RequestMethod.POST)
    public String searchFace1VN(@RequestParam("inputFileSearchImg") MultipartFile searchImg) {

        if (!searchImg.isEmpty()) {
            try {
                InputStream ist = searchImg.getInputStream();
                //save img
                targetimg.save(ist);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "hello restcontoller..";
    }

}

