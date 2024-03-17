package com.wsw01._static;

import org.w3c.dom.ls.LSOutput;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 测试static
 */


public class AChineseTest {

    public static void main(String[] args) {

        System.out.println(Chinese.nation);
        Chinese c1 = new Chinese();
        c1.name = "Jerry";
        c1.age = 15;
        System.out.println("国家：" + Chinese.nation + c1);

        Chinese c2 = new Chinese();
        c2.name = "Tom";
        c2.age = 18;
        System.out.println("国家：" + Chinese.nation + c2);
    }
}

/**
 * 中国人的类
 */
class Chinese {
    // 实例变量
    String name;
    int age;

    // 类变量
    public static String nation = "China";

    public static void show() {
        System.out.println("我是一个中国人！！！");
        // 调用静态的结构
        System.out.println("nation = " + nation);
        method();
        // 调用非静态的结构
        //System.out.println("name = " + name);
        //eat();
    }

    public static void method() {
        System.out.println("我是静态测试方法！！！");
    }

    public void dynamicMethod() {
        System.out.println("我是非静态的测试方法");
        // 调用非静态的结构
        System.out.println("name = " + this.name);
        eat();

        // 调用静态的结构
        System.out.println("nation = " + nation);
        method();
    }

    public void eat() {
        System.out.println("正在吃东西！！！");
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
