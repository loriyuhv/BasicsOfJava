package com.wsw01.exaple;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author loriyuhv
 * @ClassName SingletonDemo
 * @date 2024/3/23 11:33
 * @description 单例模式的饿汉式和懒汉式中，私有化类的构造器了！
 * 此时通过反射，可以创建单例模式中类的多个对象吗？
 */

public class SingletonDemo {
    @Test
    public void test2(){
        Bank instance = Bank.getInstance();
        System.out.println(instance);
        Bank instance1 = Bank.getInstance();
        System.out.println(instance1);
    }

    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Bank> clazz = Bank.class;
        Constructor<Bank> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Bank bank = cons.newInstance();
        Bank bank1 = cons.newInstance();
        System.out.println(bank);
        System.out.println(bank1);
    }
}

/**
 * @description 单例模式之饿汉式
 */
class Bank {
    private Bank() {}

    private static final Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
