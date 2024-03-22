package com.wsw99.test;

/**
 * @author loriyuhv
 * @ClassName User
 * @date 2024/3/22 20:33
 * @description TODO
 */

public class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
