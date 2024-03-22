package com.wsw.java1;

import org.junit.Test;

import java.io.*;

/**
 * @author loriyuhv
 * @ClassName ActiveUse
 * @date 2024/3/22 23:40
 * @description 测试类的主动使用；意味着会调用类的<clinit>()，即执行了类的初始化阶段
 * 1. 当创建一个类的实例时。比如使用new关键字，或者通过反射、克隆、反序列化。
 */

public class ActiveUse {
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
    public void test1(){
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
}


class Order implements Serializable {
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
            System.out.println("CompareA的初始化");
        }
    };
}
