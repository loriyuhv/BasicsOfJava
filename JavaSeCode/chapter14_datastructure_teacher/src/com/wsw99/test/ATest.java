package com.wsw99.test;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 数组初始化方式
 */

public class ATest {

    @Test
    public void test() {
        // 一维数组的声明
        // int[] arr;
        // 一维数组的初始化
        // 1.静态初始化
        // 1.1 一维数组的声明和静态初始化方式1
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for(int a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
        // 1.2 一维数组的声明和静态初始化方式2
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int a : arr2) {
            System.out.print(a + "\t");
        }
        System.out.println();

        // 动态初始化
        int[] array = new int[5];
        array[0] = 1;
        for(int a : array) {
            System.out.print(a + "\t");
        }
    }


    @Test
    public void test2() {
        // 一维数组声明
        Object[] objects = new Object[10];
        // 一维数组动态初始化
        objects[0] = new String("Jerry");
        objects[1] = new String("Tom");

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    @Test
    public void test3() {
        System.out.println(3 >> 1);
    }

}
