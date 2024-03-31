package com.example.myapplication1;

import java.io.Serializable;
public class Object implements Serializable {
    private String name;
    private int age;
    public Object(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
