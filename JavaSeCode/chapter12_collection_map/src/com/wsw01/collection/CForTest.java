package com.wsw01.collection;

import com.wsw02.list.AListTest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description foreach使用
 */

public class CForTest {
    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(128);
        coll.add(new Person("Jerry", 18));

        for(Object obj : coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        for(int a : arr){
            System.out.println(a);
        }

        String[] strings = new String[]{"Jerry", "Jack", "Alan"};
        for(String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test3() {
//        String[] strings = new String[]{"Jerry", "Jack", "Marry"};

//        for(int i = 0; i < strings.length; i++){
//            strings[i] = "Hello";
//        }

//        for (String string : strings) {
//            string = "Hello";
//        }
//
//        for(String string : strings) {
//            System.out.println(string);
//        }

        Collection collection = new ArrayList();
        collection.add("Jerry");
        collection.add("Jack");
        collection.add("Alice");

//        for (Object coll : collection) {
//            if (coll.equals("Jerry")) {
//                collection.remove(coll);
//            }
//        }

        for(Object collection1 : collection) {
            System.out.println(collection1);
        }

    }
}
