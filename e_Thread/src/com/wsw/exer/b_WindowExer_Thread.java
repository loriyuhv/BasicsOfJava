package com.wsw.exer;

/**
 * @author loriyuhv
 * @date 2024/3/12
 * @description 例子：创建三个窗口买票，总票数为100张
 * 存在线程安全问题，待解决
 */

class Window extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while(true) {
            if (tickets > 0) {
                System.out.println(getName() + ": 卖票，票号为：" + tickets);
                tickets--;
            } else {
                break;
            }
        }
    }
}

public class b_WindowExer_Thread {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.setName("窗口1：");
        t1.start();
        t2.setName("窗口2：");
        t2.start();
        t3.setName("窗口3：");
        t3.start();

    }

}
