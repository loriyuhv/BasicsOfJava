package com.wsw01.exaple;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description
 */

public class Person {
    // 属性
    private String name;
    public int age;

    // 构造器
    public Person() {
        System.out.println("Person() ...");
    }

    public Person(int age) {
        this.age = age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void show() {
        System.out.println("您好！我是一个Person");
    }

    private String showNation(String nation) {
        return "我的国家是" + nation + "。";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
