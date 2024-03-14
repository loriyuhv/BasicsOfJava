package com.wsw99.ztest;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description TODO
 */

interface Hello {
    void display();
}

interface Active extends Hello{
    void start();
    void stop();
}

class Person implements Active {

    @Override
    public void display() {
        System.out.println("Hello world");
    }

    @Override
    public void start() {
        System.out.println("行为开始了");
    }

    @Override
    public void stop() {
        System.out.println("行为结束了");
    }
}
public class DInterfaceThrowTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.start();
        person.display();
    }
}
