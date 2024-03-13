package com.wsw.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：lock锁 -- JDK5.0 新增
 * 1. 面试题：synchronized与lock的异同？
 * 相同：二者都可以解决线程安全问题
 * 不同：synchronized机制在执行完相应的同步代码之后，自动释放同步监视器
 *      Lock需要手动地启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
 * @author loriyuhv
 * @date 2024/3/12
 * @description TODO
 */
class Window implements Runnable {
    private int ticket = 100;
    // 1. 实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true); // fair: true:公平锁  false: 非公平锁

    @Override
    public void run() {
        while(true) {
            try {
                //2.调用锁定方法：lock()
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                // 3. 调用解锁的方法：unlock()
                lock.unlock();
            }
        }
    }
}
public class e_LockTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
