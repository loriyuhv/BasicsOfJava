package com.wsw99.test.modifier01;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 权限修饰符：private protected 缺省  public
 * 1. 验证本类内部
 * 2. 验证本包内部
 */


public class Modifier01Test {
    public static void main(String[] args) {
        Student jerry = new Student("Jerry", 18, "20197360", 69.2);
        // 验证本类内部
        // jerry.display();
        // 验证本包内部
        // System.out.println(jerry.name); //private 显式编译时异常
        System.out.println(jerry.age);
        System.out.println(jerry.stuId);
        System.out.println(jerry.weight);
    }
}
