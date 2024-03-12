package com.wsw.java;

/**
 * 测试Thread中的常用方法
 * 1. start(): 启动当前线程，调用当前线程的run()
 * 2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3. currentThread()：静态方法，返回执行当前代码的线程
 * 4. getName(): 获取当前线程的名字
 * 5. setName(): 设置当前线程的名字
 * 6. yield(): 释放当前CPU的执行权
 * 7. join(): 在线程a中调用线程b的join()，此时线程a就进入阻塞状态，知道线程b完全执行完
 *              以后，线程a才结束阻塞状态。
 * 8. stop()：已过时。当执行此方法，强制结束当前线程。
 * 9. sleep(long millitime): 让当前线程“睡眠”指定的millitime(毫秒）,在指定的millitime
 *      毫秒时间内，当前线程是阻塞状态。
 * 10. isAlive(): 判断当前线程是否还存活
 * -------------------------------------------
 * 线程的优先级
 * MAX_PRIORITY: 10
 * MIN_PRIORITY: 1
 * NORM_PRIORITY: 5
 * 2. 如何获取和设置当前线程的优先级
 *  getPriority(): 获取线程的优先级
 *  setPriority(int newPriority): 设置线程的优先级
 * @author loriyuhv
 * @date 2024/3/12
 * @description Thread类常用方法
 */


class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++ ) {
            if (i % 2 == 0) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                     throw new RuntimeException(e);
//                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

//            if (i % 20 == 0) {
//                this.yield();
//            }
        }
    }

    public HelloThread(String name) {
        super(name);
    }
}

public class b_ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        HelloThread hello = new HelloThread("Thread1");
        //hello.setName("Hello线程");
        hello.start();
        hello.setPriority(10);
        System.out.println(hello.getPriority());

        // 给主线程命名
        Thread.currentThread().setName("主线程");

        for (int i = 0 ; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": main" + i);
            if (i == 20) {
                System.out.printf(hello.isAlive() + ":");
                hello.join();
            }
        }

    }
}
