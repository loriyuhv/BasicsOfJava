package com.wsw04.block;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 代码块测试
 */

public class ABlockTest {

    @Test
    public void test1() {
        // Person jerry = new Person("Jerry", 18);
        // System.out.println(Person.class);
        Person person = new Person();
        System.out.println(" ------------------");
        Person person1 = new Person();
        System.out.println(person);
    }

}

class Person {
    String name;
    int age;
    static String string = "I love my house!!!";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void display() {
        System.out.println(string);
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        name = "anonymity";
        age = 18;
    }

    // 静态代码块
    static {
        System.out.println("静态代码块1");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
