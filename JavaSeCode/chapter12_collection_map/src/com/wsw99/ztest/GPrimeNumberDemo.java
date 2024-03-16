package com.wsw99.ztest;

import java.util.ArrayList;

/**
 * @author loriyuhv
 * @date 2024/3/15
 * @description 求100以内的素数
 */

public class GPrimeNumberDemo {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumber = getPrimeNumber();
        for (Integer i : primeNumber) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> getPrimeNumber() {
        ArrayList<Integer> integers = new ArrayList<>();
        int primeNumber = 3;
        for (primeNumber = 3; primeNumber < 100; primeNumber += 2) {
            int j;
            for (j = 2; j <= primeNumber; j++) {
                if (primeNumber % j == 0) {
                    break;
                }
            }

            if (primeNumber == j) {
                integers.add(primeNumber);
            }
        }
        return integers;
    }
}
