package com.wsw99.test;

import com.wsw99.test.modifier01.Student;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 验证其他包的非子类：权限修饰符：private protected 缺省  public
 */

public class ETest {
    public static void main(String[] args) {
        Student jerry = new Student("Jerry", 18, "20197360", 69.2);
        // 验证其他包的非子类
        //System.out.println(jerry.name);
        //System.out.println(jerry.age);
        //System.out.println(jerry.stuId);
        System.out.println(jerry.weight);
    }
}
