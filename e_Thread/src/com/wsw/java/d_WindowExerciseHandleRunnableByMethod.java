package com.wsw.java;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显示的声明
 * 2. 非静态的同步方法，同步监视器是：this
 *    静态的同步方法，同步监视器是：当前类本身
 *
 * @author loriyuhv
 * @date 2024/3/12
 * @description 解决卖票问题的同步问题
 */

class Window5 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() { // 同步监视器：this
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
            ticket--;
        }
    }
}

public class d_WindowExerciseHandleRunnableByMethod {
    public static void main(String[] args) {
        Window5 window5 = new Window5();
        Thread t1 = new Thread(window5);
        Thread t2 = new Thread(window5);
        Thread t3 = new Thread(window5);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
