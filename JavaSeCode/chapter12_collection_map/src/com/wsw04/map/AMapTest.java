package com.wsw04.map;

import org.junit.Test;

import java.util.*;

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

    @Test
    public void test4() {
        Map map = new TreeMap();
        map.put(8, "Jerry");
        map.put(7, "Tom");
        map.put(6, "Alice");
        map.put(3, "Bob");
        map.put(5, "Alan");
        map.put(15, "Linus");
        map.put(12, "Windows");
        // {3=Bob, 5=Alan, 6=Alice, 7=Tom, 8=Jerry, 12=Windows, 15=Linux}
        // {3=Bob, 5=Alan, 6=Alice, 7=Tom, 8=Jerry, 12=Windows, 15=Linus}
        System.out.println(map);

        String i = new String("AAAAAAAA");
        String i2 = new String("BBBBBBBB");
        int i1 = i.hashCode();
        int i3 = i2.hashCode();
        System.out.println(i1);
        System.out.println(i3);

    }

}
