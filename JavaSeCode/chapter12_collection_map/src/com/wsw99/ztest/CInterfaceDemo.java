package com.wsw99.ztest;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description 接口实现例子
 */

interface USB {
    void start();
    void stop();
}

class Computer {
    public static void show(USB usb) {
        usb.start();
        System.out.println("=========== USB 设备工作 ===========");
        usb.stop();
    }
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Print implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}


public class CInterfaceDemo {
    public static void main(String[] args) {
//        Computer.show(new Flash());
//        Computer.show(new Print());
//        Computer.show(new USB() {
//            @Override
//            public void start() {
//                System.out.println("硬盘开始工作");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("硬盘结束工作");
//            }
//        });
//        USB usb = new Print();
//        usb.start();
//        usb.stop();
    }
}
