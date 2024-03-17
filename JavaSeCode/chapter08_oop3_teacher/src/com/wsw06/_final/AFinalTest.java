package com.wsw06._final;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description final关键字使用
 */

// final修饰类，表示这个类不能被继承
final class People {
    String name;
    int age;
}

// java: 无法从最终com.wsw06._final.People进行继承
//class Student extends People {
//
//}


class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void jump() {
        System.out.println("这个动物正在跳跃！！！");
    }
}

class Dog extends Animal {
    String food;

    public Dog() {
    }

    public Dog(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

//    @Override
//    public void jump() { // 会报错
//        System.out.println("这只狗正在跳跃！！！");
//    }
}


class Employee {
    private String name;
    public final double SALARY;

    // 初始块赋值
    {
        // SALARY = 3000;
    }

    public Employee() {
        SALARY = 3000;
    }

    public Employee(String name) {
        this.name = name;
        this.SALARY = 3000;
    }
}
public class AFinalTest {

    @Test
    public void test() {
        // Student student = new Student();
        String string = "123";
        System.out.println(string);

        Dog dog = new Dog();
        dog.jump();

        // final修饰变量之后不能修改，即常量。
        final double PI = 3.1415926;
        System.out.println(PI);
        // a = 2;

    }

    @Test
    public void test2() {
        Employee employee = new Employee("Jerry");
        System.out.println(employee.SALARY);
    }
}
