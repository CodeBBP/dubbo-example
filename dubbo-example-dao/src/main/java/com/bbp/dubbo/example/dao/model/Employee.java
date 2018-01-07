package com.bbp.dubbo.example.dao.model;

import java.io.Serializable;

/**
 * 工程：sstudy
 * 包名：com.bbp.example.dao.model
 * 描述：TODO
 * 作者：mrbbp@qq.com
 * 创建时间：2018年01月02日  22:21
 * <p>
 * <p>
 * 【修改历史】
 * 修改人：mrbbp@qq.com   修改时间：2018年01月02日  22:21     修改项描述：初始创建
 */

public class Employee implements Serializable {
    private String id;
    private String name;
    private String gender;
    private String age;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }
}
