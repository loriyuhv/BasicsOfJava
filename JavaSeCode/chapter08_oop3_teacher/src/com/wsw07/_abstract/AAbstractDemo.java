package com.wsw07._abstract;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 抽象类练习
 */

abstract class People {
    public abstract void eat();
    public abstract void exercise();
}

class Student extends People {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃饭！！！");
    }

    @Override
    public void exercise() {
        System.out.println(name + "正在运动！！！");
    }
}

class UniversityStudent extends Student {
    String specialty;

    public UniversityStudent(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }
}
public class AAbstractDemo {

    @Test
    public void test() {
        Student jerry = new Student("Jerry");
        jerry.eat();
        jerry.exercise();
    }

    @Test
    public void test1() {
        UniversityStudent jerry = new UniversityStudent("Jerry", "Computer");
        jerry.eat();
        jerry.exercise();
    }
}
