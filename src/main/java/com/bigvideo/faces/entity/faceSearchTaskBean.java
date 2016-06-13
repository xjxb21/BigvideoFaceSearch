package com.bigvideo.faces.entity;

import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * Created by xiao on 2016/6/6.
 */

@Component
public class faceSearchTaskBean {

    private int id;
    private int gender;
    private String imgName;
    private String idCard;
    private int ageStart;
    private int ageEnd;
    private String address;

    private InputStream ImgInputStream;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getAgeStart() {
        return ageStart;
    }

    public void setAgeStart(int ageStart) {
        this.ageStart = ageStart;
    }

    public int getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(int ageEnd) {
        this.ageEnd = ageEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InputStream getImgInputStream() {
        return ImgInputStream;
    }

    public void setImgInputStream(InputStream imgInputStream) {
        ImgInputStream = imgInputStream;
    }
}
