package com.bigvideo.faces.dao;

import org.springframework.stereotype.Repository;

/**
 * 人脸图片搜索任务
 */

@Repository
public class FaceSearchTaskForOracleDaoImpl implements IfaceSearchTaskDao {

    /**
     * 添加搜索任务
     */
    @Override
    public void addFaceSearchTask() {
        System.out.println("add search task...");
    }
}
