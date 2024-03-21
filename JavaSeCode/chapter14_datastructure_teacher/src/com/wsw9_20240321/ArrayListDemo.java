package com.wsw9_20240321;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description
 */

public class ArrayListDemo {
    @Test
    public void test1() {
        // ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        ArrayList<Integer> integers1 = new ArrayList<>(integers);
        for (Integer integer : integers1) {
            System.out.println(integer);
        }

    }


}
