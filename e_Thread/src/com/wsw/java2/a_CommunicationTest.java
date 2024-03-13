package com.wsw.java2;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description 线程通信的例子：使用两个线程打印1-100.线程1，线程2交替打印
 * 涉及到的三个方法：
 * 1）wait(): 一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * 2）notify(): 一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就
 *      唤醒优先级高的那个。
 * 3）notifyAll(): 一旦执行此方法，就会唤醒所有被wait的一个线程。
 *
 * 说明：
 * 1. wait(), notify(), notifyAll()三个方法必须使用在同步代码坏或同步方法中
 * 2. wait(), notify(), notifyAll()三个方法调用者必须是同步代码块或同步方法中的
 *      同步监视器，否则，就会出现IllegalMonitorStateException。
 * 3. wait(), notify(), notifyAll()三个方法都是定义在java.lang.Object类中。
 *
 * 面试题：sleep() 和 wait()的异同？
 * 1. 相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态。
 * 2. 不同点：
 *      1）两个方法声明的位置不同：Thread类中声明sleep()，Object类中声明wait()
 *      2）调用的要求不同：sleep()可以在任何需要的场景下调用。wait()必须使用在
 *          同步代码块或同步方法中。
 *      3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()
 *          不会释放锁，wait()会释放锁。
 *
 */

class Number implements Runnable {
    private int number = 1;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                // this.notify();
                obj.notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    // 使用调用如下wait()方法的线程进入阻塞状态
                    try {
                        // this.wait();
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class a_CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
