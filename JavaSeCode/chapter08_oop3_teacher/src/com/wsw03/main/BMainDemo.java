package com.wsw03.main;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description Main方法刨析
 */

public class BMainDemo {
    public static void main(String[] args) {
        for (int i= 0; i < args.length; i++) {
            System.out.println("Hello:" + args[i]);
        }
    }
}
