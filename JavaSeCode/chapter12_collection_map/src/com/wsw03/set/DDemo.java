package com.wsw03.set;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author loriyuhv
 * @date 2024/3/15
 * @description 在List内去除重复数字值，要求尽量简单
 */


public class DDemo {
    public static ArrayList<Integer> duplicateList(ArrayList<Integer> list) {
        HashSet<Integer> integers = new HashSet<>();
        for (Integer l : list) {
            integers.add(l);
        }
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (Integer integer : integers) {
            integers1.add(integer);
        }

        return integers1;
    }

    public static ArrayList<Integer> duplicateList1(ArrayList<Integer> list) {
        HashSet<Integer> integers = new HashSet<>();
        integers.addAll(list);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(integers);

        return integers1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(1);

//        ArrayList<Integer> integers1 = duplicateList(integers);
        ArrayList<Integer> integers1 = duplicateList1(integers);
        for (Integer i :
                integers1) {
            System.out.println(i);
        }


    }
}
