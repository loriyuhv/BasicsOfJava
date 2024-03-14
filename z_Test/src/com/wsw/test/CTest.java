package com.wsw.test;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description TODO
 */

class Person {
    public void show() {
        System.out.println("这个人正在表演！！！");
    }
}

class Test {
    public void getObject(Person a) {
        a.show();
    }
}

public class CTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.getObject(new Person());
    }
}
