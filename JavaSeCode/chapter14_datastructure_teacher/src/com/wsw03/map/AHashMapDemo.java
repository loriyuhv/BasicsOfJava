package com.wsw03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
}
