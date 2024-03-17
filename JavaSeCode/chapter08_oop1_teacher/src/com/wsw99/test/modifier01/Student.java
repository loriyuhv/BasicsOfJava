package com.wsw99.test.modifier01;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 学生类：测试权限修饰符：private protected 缺省  public
 */

public class Student {
    private String name;
    protected int age;
    String stuId;
    public double weight;

    public Student() {
    }

    public Student(String name, int age, String stuId, double weight) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("学号：" + stuId + " 姓名：" + name + " 年龄：" + age + " 体重：" + weight + "kg");
    }
}
