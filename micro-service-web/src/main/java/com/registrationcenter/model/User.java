package com.registrationcenter.model;

import java.io.Serializable;

/**
 * Created by Wangxy on 2018/1/31..
 *
 * @author wangxy
 */
public class User implements Serializable{
    public User() {
        super();
    }

    public User(Integer userId, String name,Integer age) {
        this.userId = userId;
        this.age = age;
        this.name = name;
    }

    private Integer userId;

    private Integer age;

    private String name;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
