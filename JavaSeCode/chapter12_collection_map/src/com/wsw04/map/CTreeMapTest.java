package com.wsw04.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description TreeMap测试
 */

public class CTreeMapTest {

    /**
     * 自然排序
     */
    @Test
    public void test1() {
        TreeMap treeMap = new TreeMap();
        treeMap.put("BB", 12);
        treeMap.put("AA", 18);
        treeMap.put("DD", 15);
        treeMap.put("ZZ", 12);

        Set set = treeMap.entrySet();
        for(Object object : set) {
            System.out.println(object);
        }
    }

    @Test
    public void test2() {
        TreeMap map = new TreeMap<>();
        Person tom = new Person("Tom", 23);
        Person jerry = new Person("Jerry", 23);
        Person alice = new Person("Alice", 22);
        Person alan = new Person("Alan", 21);
        Person bool = new Person("Bool", 24);
        Person geek = new Person("Geek", 13);

        map.put(tom, 92);
        map.put(jerry, 91);
        map.put(alice, 90);
        map.put(alan, 82);
        map.put(bool, 100);
        map.put(geek, 88);

        System.out.println(map);

        Person tom1 = new Person("AA", 23);
        Map map1 = new TreeMap<>();

        boolean b = map.containsKey(tom1);
        boolean b1 = map.containsValue(91);
        System.out.println(b);
        System.out.println(b1);
    }

    /**
     * 定制排序
     */
    @Test
    public void test3() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) {
                    return 0;
                }
                if (o1 instanceof Person p1 && o2 instanceof Person p2) {
                    int value = p1.name.compareTo(p2.name);
                    if (value != 0) {
                        return value;
                    }
                    return p1.age - p2.age;
                }
                throw new RuntimeException("类型不匹配！！！");
            }
        };

        TreeMap map = new TreeMap<>(comparator);
        Person tom = new Person("Tom", 23);
        Person jerry = new Person("Jerry", 23);
        Person alice = new Person("Alice", 22);
        Person alan = new Person("Alan", 21);
        Person bool = new Person("Bool", 24);
        Person geek = new Person("Geek", 13);

        map.put(tom, 92);
        map.put(jerry, 91);
        map.put(alice, 90);
        map.put(alan, 82);
        map.put(bool, 100);
        map.put(geek, 88);

        System.out.println(map);

    }

}
