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
}
