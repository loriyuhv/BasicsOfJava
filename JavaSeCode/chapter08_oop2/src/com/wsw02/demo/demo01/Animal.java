package com.wsw02.demo.demo01;

/**
 * @author loriyuhv
 * @ClassName Animal
 * @date 2024/3/24 21:59
 * @description
 */

public class Animal extends Creature{
    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，为" + age);
    }
}

