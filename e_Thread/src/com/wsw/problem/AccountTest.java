package com.wsw.problem;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。有两个储户分别向同一个账户存3000元，
 * 每次存1000，存3次。每次存完打印账户余额。
 *
 * 分析：
 * 1. 是否是多线程问题？是，两个储户线程
 * 2. 是否有共享数据？有，账户（或账户余额）
 * 3. 是否有线程安全问题？有
 * 4. 需要考虑如何解决线程安全问题？同步机制：有三种方式。
 * @author loriyuhv
 * @date 2024/3/12
 * @description TODO
 */

class Account {
    private double balance;
    private ReentrantLock lock = new ReentrantLock(true);

    public Account(double balance) {
        this.balance = balance;
    }

    // 存钱
    public void deposit(double amt) throws InterruptedException {
        try {
            lock.lock();
            if (amt > 0) {
                balance += amt;
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
            }
        } finally {
            lock.unlock();
        }

    }
}

class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            try {
                account.deposit(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);

        customer2.setName("乙");
        customer1.setName("甲");

        customer1.start();
        customer2.start();

    }
}
