package com.chang.myblog.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement//mediatype转化为xml
public class User {

    private long id;//用户唯一标识
    private String name;
    private int age;

    public User(){//无参构造函数

    }
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
