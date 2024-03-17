package com.wsw02.singleton;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 懒汉式
 */

public class BGirlfriendTest {
    public static void main(String[] args) {
        Girlfriend instance = Girlfriend.getInstance();
        Girlfriend instance2 = Girlfriend.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}

class Girlfriend {
    // 1. 类的构造器私有化
    private Girlfriend() {}

    // 2. 在类内部声明当前类的实例
    // 4. 此属性也必须声明为static
    private static Girlfriend instance = null;

    // 3. 通过getXxx方法获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static Girlfriend getInstance() {
        if (instance == null) {
            instance = new Girlfriend();
        }
        return instance;
    }
}
