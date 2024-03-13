package com.wsw.java;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 * 补充：在继承Thread创建多线程的方式中，谨慎使用this充当同步监视器，可以考虑使用
 *  当前类（例如Window4.class）充当同步监视器。
 * @author loriyuhv
 * @date 2024/3/12
 * @description 解决卖票问题的同步问题 继承Thread类实现的多线程
 */

class Window4 extends Thread {
    private static int tickets = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while(true) {
            // synchronized (this) { // 错误的方式，this代表着t1, t2, t3三个对象
            synchronized (Window4.class) { // Window4.class只会加载一次
            // synchronized (obj) {
                if (tickets > 0) {
                    try {
                        sleep(0);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + ": 卖票，票号为：" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

public class d_WindowExerciseHandlerThread {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();
    }

}
