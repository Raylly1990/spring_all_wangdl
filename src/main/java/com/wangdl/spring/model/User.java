package com.wangdl.spring.model;

/**
 * Description: //TODO(简略描述这个类的作用)
 * Author: WangDL
 * Date: 2018-08-12 18:08
 * Copyright (c) 2018, ewell.com All Rights Reserved.
 */
public class User {

    private String userName;
    private String password;
    private int    age;


    public User() {
    }

    public User(String userName, String password, int age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
