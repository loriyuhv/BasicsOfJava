package com.wsw13.idea.debug;

/**
 * @author loriyuhv
 * @date 2024/3/18
 * @description 行断点
 */

public class ADebug01 {

    public static void main(String[] args) {
        //1.
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ",n = " + n);
        swap(m, n);
        System.out.println("m = " + m + ",n = " + n);

        //2.
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(arr);//地址值

        char[] arr1 = new char[] {'a','b','c'};
        System.out.println(arr1);//abc
    }

    public static void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
