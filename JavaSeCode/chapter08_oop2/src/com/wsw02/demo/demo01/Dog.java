package com.wsw02.demo.demo01;

/**
 * @author loriyuhv
 * @ClassName Dog
 * @date 2024/3/24 22:02
 * @description
 */

public class Dog extends Animal {
    public Dog() {
        super("Jerry", 18);
        System.out.println("Dog无参数的构造器！！！");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        /**
         * Creature 无参构造器.
         * Animal带一个参数的构造器，该动物的name为Jerry
         * Animal带两个参数的构造器，其age为18
         * Dog无参数的构造器！！！
         */
    }
}
