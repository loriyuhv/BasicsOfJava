package com.wsw99.test;

/**
 * @author loriyuhv
 * @ClassName ExceptionDemoTest
 * @date 2024/3/20 20:25
 * @description TODO
 */

public class ExceptionDemoTest {
    public static void main(String[] args) {
        int[] arr = {34, 12, 67};
        int element = ArrayTools.getElement(arr, 2);
        System.out.println(element);
        System.out.println("over");

    }
}

class ArrayTools {
    public static int getElement(int[] arr, int index) {
        int element;
        try {
            element =  arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            element = -1;
            System.out.println("Array index out of bounds!!!");
        } finally {
            // element = -1;
            ;
        }

        return element;
    }
}
