package com.wsw.exer;

/**
 * @author loriyuhv
 * @date 2024/3/12
 * @description 例子：创建三个窗口买票，总票数为100张 Runnable接口实现
 */

class Window2 implements Runnable {
    private int tickets = 100;
    @Override
    public void run() {
        while(true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为" + tickets);
                tickets--;
            } else {
                break;
            }
        }
    }
}

public class c_WindowExer_Runnable {
    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Thread t1 = new Thread(window2);
        t1.setName("窗口1");
        t1.start();
        Thread t2 = new Thread(window2);
        t2.setName("窗口2");
        t2.start();
        Thread t3 = new Thread(window2);
        t3.setName("窗口3");
        t3.start();

    }
}
