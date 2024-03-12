package com.wsw.exer;

/**
 * @author loriyuhv
 * @date 2024/3/12
 * @description 创建两个分线程，其中一个线程遍历100以内的偶数，另一个
 * 遍历100以内的奇数
 */

/**
 * 线程1：遍历100以内的偶数
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(this.getName() + ":" +  this.getPriority() + ":" + "100以内的偶数:" + i);
            }
        }
    }
}

/**
 * 线程2：遍历100以内的奇数
 */
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(this.getName() + ":" +  this.getPriority() + ":" + "100以内的奇数:" + i);
            }
        }
    }
}

public class a_ThreadExer {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();

        // 创建Thread类的匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello 奇数");
            }
        }.start();
    }
}
