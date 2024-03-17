package com.wsw02.singleton;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 饿汉式
 */

public class ABankTest {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();
        Bank instance1 = Bank.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}

class Bank {
    // 1. 类的构造器私有化
    private Bank() {}

    // 2. 在类的内部创建当前类的实例
    // 4. 此属性也必须声明为static的属性
    private static Bank instance = new Bank();

    // 3. 使用getXxx()方法获取当前类的实例，必须声明为static的方法
    public static Bank getInstance() {
        return instance;
    }
}

class Test{
    // 1. 类的构造器私有化
    private Test() {}

    // 2. 在类的内部创建当前类的实例
    // 4. 此属性也必须声明为static
    private static Test instance = new Test();

    // 3. 使用getXxx()方法获取当前类的实例，并声明为static的方法
    public static Test getInstance() {
        return instance;
    }
}
