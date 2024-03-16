package com.wsw04.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description TODO
 */

public class AMapTest {

    @Test
    public void test1() {
        Map map = new HashMap<>();
        map.put(null, null);
        map.put("Jerry", 18);
        System.out.println(map);
    }

    @Test
    public void test2() {
        Map map = new Hashtable();
        //map.put(null, 123); // NullPointerException
        //map.put("AA", null);// NullPointerException
        //map.put(null, null);// NullPointerException
        map.put("Jerry", 18);
        System.out.println(map);
    }

    @Test
    public void test3() {
        Map map = new LinkedHashMap();
        Map map1 = new HashMap();

        map.put("Jerry", 18);
        map.put("Tom", 21);
        map.put("Alice", 17);
        map1.put("Jerry", 18);
        map1.put("Tom", 21);
        map1.put("Alice", 17);
        System.out.println(map);
        System.out.println(map1);
    }


}
