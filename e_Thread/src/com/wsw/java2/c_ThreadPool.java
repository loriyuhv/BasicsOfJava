package com.wsw.java2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description 创建线程的方式四：使用线程池
 * 好处：
 * 1. 提高响应速度（减少了创建新线程的时间）
 * 2. 降低资源消耗（重复利用线程池中线程，不需要每次都创建
 * 3. 便于线程管理
 *      corePoolSize: 核心池的大小
 *      maximumPoolSize: 最大线程数
 *      keepAliveTime: 线程没有任务时最多保持多长时间会终止
 */

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class c_ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        // 设置线程池的属性
        // System.out.println(service.getClass());
        service1.setCorePoolSize(15);

        //2. 执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread()); //适应于Runnable
//        service.execute(new NumberThread()); //适应于Runnable
        service.execute(new NumberThread1()); //适应于Runnable
//        service.execute(new NumberThread1()); //适应于Runnable
        //service.submit(); // 适应于Callable

        //3. 关闭连接池
        service.shutdown();
    }
}
