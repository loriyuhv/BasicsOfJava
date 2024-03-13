package com.wsw.java;

/**
 * 使用同步方法处理继承Thread类的线程安全问题
 *
 * @author loriyuhv
 * @date 2024/3/12
 * @description TODO
 */

class Window6 extends Thread {
    private static int tickets = 100;
    @Override
    public void run() {
        while(true) {
            show();
        }
    }

    // private synchronized void show() { // 同步监视器：this: t1,t2,t3
    private static synchronized void show() { // 同步监视器： Window6.class
        if (tickets > 0) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + tickets);
            tickets--;
        }
    }
}

public class d_WindowExerciseHandleThreadByMethod {
    public static void main(String[] args) {
        Window6 t1 = new Window6();
        Window6 t2 = new Window6();
        Window6 t3 = new Window6();

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();
    }
}
