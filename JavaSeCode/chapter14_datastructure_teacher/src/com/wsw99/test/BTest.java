package com.wsw99.test;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 懒汉式和饿汉式
 */

class Singleton {
    public String name;
    // 1. 私有化构造器
    private Singleton() {}

    // 2. 内部提供一个当前类的实例
    // 3. 此实例也必须静态化
    private static final Singleton single = new Singleton();

    // 3. 提供公共的静态方法，返回当前类的对象
    public static Singleton getInstance() {
        return single;
    }

    public void display() {
        System.out.println("Hello world!!!");
    }
}

public class BTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
    @Test
    public void test() {
        Singleton instance = Singleton.getInstance();
        instance.display();
        Singleton instance1 = Singleton.getInstance();

    }
}
