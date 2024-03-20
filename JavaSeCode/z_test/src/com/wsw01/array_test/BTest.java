package com.wsw01.array_test;

import java.util.Arrays;

/**
 * System.arraycopy(Object src,  int  srcPos,
 *      Object dest, int destPos, int length);
 * src: 原对象
 * srcPos: 源数组中的起始位置
 * dest: 目标数组对象
 * destPos: 目标数据中的起始位置
 * length: 要拷贝数组元素的数量
 */

public class BTest {
    public static void main(String[] args) {
        int[] original = new int[]{1, 2};
        int[] copy = new int[10];

        System.arraycopy(original, 0, copy, 0, 2);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));


        int[] arr1 = new int[]{5, 6, 7};
        System.out.println(arr1.length);
        int[] arr2 = Arrays.copyOf(arr1, 10);
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
