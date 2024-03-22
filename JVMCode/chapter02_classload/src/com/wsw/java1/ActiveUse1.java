package com.wsw.java1;

import org.junit.Test;

import java.io.*;
import java.util.Random;

/**
 * @author loriyuhv
 * @ClassName ActiveUse
 * @date 2024/3/22 23:40
 * @description 测试类的主动使用；意味着会调用类的<clinit>()，即执行了类的初始化阶段
 * 1. 当创建一个类的实例时。比如使用new关键字，或者通过反射、克隆、反序列化。
 */

public class ActiveUse1 {
    /**
     * @description 1. 当创建一个类的实例时。比如使用new关键字，或者通过反射、克隆、反序列化。
     */
    public static void main(String[] args) {
        Order order = new Order();
    }

    /**
     * @description 序列化的过程
     */
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order.dat"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @description 调用类的静态方法
     */
    @Test
    public void test2() {
        Order.method();
    }

    /**
     * @description 输出类的静态变量，类变量没有final修饰
     */
    @Test
    public void test3() {
        System.out.println(Order.AGE);
    }

    /**
     * @description 输出类的静态变量，类变量有final修饰
     */
    @Test
    public void test4(){
        System.out.println(Order.AGE);
    }

    /**
     * @description 输出类的静态变量，类变量有final修饰，并且有new Random().nextInt(10)
     */
    @Test
    public void test5(){
        System.out.println(Order.AGES); //
    }
}

class Order implements Serializable, MyInstance {
    static final int AGE = 10; // 对应test4；在链接环节的准备阶段赋值
    static final int AGES = new Random().nextInt(10); // test5；在初始化阶段赋值
    // static int AGE = 10; // 对应test3
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method() {
        System.out.println("Order method()......");
    }
}

interface MyInstance {
    public static final Thread t = new Thread() {
        {
            System.out.println("MyInstance的初始化");
        }
    };

    public default void method1() {
        System.out.println("Hello world!!!");
    }
}
