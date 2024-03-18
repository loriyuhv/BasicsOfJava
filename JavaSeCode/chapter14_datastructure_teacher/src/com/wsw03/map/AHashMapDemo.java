package com.wsw03.map;

import org.junit.Test;

import java.util.*;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 查看HashMap源码
 */



public class AHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 78);
        map.put("BB", 88);
        map.put("CC", 98);
        map.put("Jerry", 98);
        map.put("Tom", 98);
        map.put("Jack", 98);
        map.put("Alice", 98);

    }

    @Test
    public void test() {
        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);

        map.put("AA", 78); // hash:2226 i:2
        map.put("BB", 88); // hash:2260 i:4

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("AA", 123);
    }

    @Test
    public void test3(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Jerry", 78);
        map.put("Jack", 75);
        map.put("Tom", 88);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        // iterator实例调用hasNext()方法作为while循环条件；
        while(iterator.hasNext()) {
            // 循环体内遍历输出iterator实例调用next()返回的结果。
            System.out.println(iterator.next());
        }

        // Iterator接口提供遍历任何Collection的接口。我们从一个Collection中使用iterator
        // 方法来获取iterator实例。
        //
    }

}
