package com.itcast.bean;

public class Dog {
    private  String nickName;
    private  String masterName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                ", masterName='" + masterName + '\'' +
                '}';
    }
}
