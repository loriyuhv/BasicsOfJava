package com.wsw.java;

/**
 * * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run中
 * 3. 创建Thread类子类的对象
 * 4. 通过此对象调用start()
 *
 * @author loriyuhv
 * @date 2024/3/12
 * @description 多线程测试，遍历100以内的所有的偶数
 */

// 1. 创建一个继承于Thread类的子类
class MyThread extends Thread {
    // 2. 重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class a_ThreadTest {
    public static void main(String[] args) {
        // 3. 创建Thread类子类的对象
        MyThread t1 = new MyThread();
        // 4. 通过此对象调用start(): 1) 启动当前线程 2）调用当前线程的run()
        t1.start();
        // 问题一：我们不能通过直接调用run()的方式启动线程
        // t1.run();

        // 问题二：再启动一个线程，遍历100以内的偶数，不可以还让已经start()
        // 的线程去执行，会报IllegalThreadStateException
        // t1.start();
        MyThread t2 = new MyThread();
        t2.start();

        // 如下操作仍能是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + "Hello!!!");
        }
    }
}