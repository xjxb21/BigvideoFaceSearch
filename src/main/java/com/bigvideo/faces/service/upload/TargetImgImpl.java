package com.bigvideo.faces.service.upload;

import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * 用于上传的单个图片的处理
 */
@Service(value = "targetimg")
public class TargetImgImpl implements IimgOpration{

    private InputStream imgInputStream; //图片流文件
    private String imgName; //图片名称

    public TargetImgImpl(InputStream inputStream) {
        this.imgInputStream = inputStream;
    }

    @Override
    public void save(InputStream inputStream) {
        System.out.println("save target img....");
    }

    @Override
    public void rename(String name) {
        this.imgName = name;
    }
}
