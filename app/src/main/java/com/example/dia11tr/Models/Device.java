package com.example.dia11tr.Models;

public class Device {

    Integer ID;
    String Code;
    String desc;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Device(Integer ID, String code, String desc) {
        this.ID = ID;
        Code = code;
        this.desc = desc;
    }


}
