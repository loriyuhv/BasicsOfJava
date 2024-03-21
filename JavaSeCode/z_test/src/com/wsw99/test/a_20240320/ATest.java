package com.wsw99.test.a_20240320;

/**
 * 练习单例模式饿汉式和懒汉式
 */

public class ATest {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();
        Bank instance1 = Bank.getInstance();
        System.out.println(instance);
        System.out.println(instance1);

        Girlfriend instance2 = Girlfriend.getInstance();
        Girlfriend instance3 = Girlfriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance3);

    }
}

class Bank {
    // 1. 类的构造器私有化
    private Bank() {}

    // 2. 在类内部创建当前类的实例
    private static Bank instance = new Bank();

    // 3. 
    public static Bank getInstance() {
        return instance;
    }
}

class Girlfriend {
    private Girlfriend() {}

    private static Girlfriend instance = null;

    public synchronized static Girlfriend getInstance() {
        if (instance == null) {
            instance = new Girlfriend();
        }
        return instance;
    }
}

