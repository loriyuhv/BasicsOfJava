package com.wsw.problem;

/**
 * 演示线程的死锁问题
 * 1. 死锁的理解：不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃
 * 自己需要的同步资源
 * 2. 说明：
 *  1）不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续
 *  2）我们使用同步时，要避免死锁
 *
 * @author loriyuhv
 * @date 2024/3/12
 * @description TODO
 */



public class ThreadDeadLock {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread-0正在执行、获取S1锁！！！");
                synchronized (s1) {
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread-0正在执行、获取S2锁！！！");
                    synchronized (s2) {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                    System.out.println("Thread-0释放s2锁！！！");
                }
                System.out.println("Thread-0释放s1锁！！！");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-1正在执行、获取S2锁！！！");
                synchronized (s2) {
                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread-1正在执行、获取S1锁！！！");
                    synchronized (s1) {
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                    System.out.println("Thread-1释放s1锁！！！");
                }
                System.out.println("Thread-1释放s2锁！！！");
            }
        }).start();
    }
}
