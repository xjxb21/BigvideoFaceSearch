package com.bigvideo.faces.service.upload;

import java.io.InputStream;

/**
 * Created by xiao on 2016/6/6.
 */
public interface IimgOpration {

    /**
     * 图片文件报错
     * @param inputStream
     */
    void save(InputStream inputStream);

    /**
     * 重命名图片名称（图片的保存建议重命名）
     * @param name
     */
    void rename(String name);
    
}
