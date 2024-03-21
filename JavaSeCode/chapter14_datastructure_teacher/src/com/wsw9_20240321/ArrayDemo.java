package com.wsw9_20240321;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description 数组练习
 */

public class ArrayDemo {

    @Test
    public void test1() {
        // 静态初始化
        int[] arr;
        arr = new int[]{1, 2, 3};

        int[] arr2 = new int[]{1, 2, 3};

        // 动态初始化
        int[] brr;
        brr = new int[3];
        brr[0] = 1; brr[1] = 2; brr[2] = 3;

        int[] brr2 = new int[3];
        brr2[0] = 1; brr2[1] = 2; brr2[2] = 3;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.toString(brr2));
    }


}
