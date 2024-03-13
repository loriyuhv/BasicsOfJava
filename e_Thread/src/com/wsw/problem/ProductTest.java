package com.wsw.problem;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description 线程通信的应用：经典例题：生产者/消费者问题
 * 生产者(Producer)将产品交给店员(Clerk)，而消费者(Client)从店员处
 * 取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 * 分析：
 * 1. 是否是多线程问题？ 是，生产者线程，消费者线程
 * 2. 是否有共享数据？是，店员（或产品）
 * 3. 如何解决线程的安全问题？同步机制，有三种方法
 * 4. 是否涉及线程的通信？是
 */

class Clerk{
    private int clerk = 0;

    public synchronized void addProduct(){
        if (clerk < 20) {
            clerk++;
            System.out.println(Thread.currentThread().getName() + "正在生产第" + clerk + "个产品！！！");
            notify();
        } else {
            // 等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void getProduct() {
        if (clerk > 0) {
            System.out.println(Thread.currentThread().getName() + "正在消费第" + clerk + "个产品！！！");
            clerk--;
            notify();
        } else {
            // 等待
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品...");
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();
        }
    }
}

class Client extends Thread {
    private Clerk clerk;

    public Client(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始取走产品...");
        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.getProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        Client client = new Client(clerk);
        Client client1 = new Client(clerk);

        producer.setName("生产者");
        client.setName("消费者");
        client1.setName("消费者1");

        producer.start();
        client.start();
        client1.start();
    }
}
