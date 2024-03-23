package com.wsw01.use;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.*;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description 在集合中泛型的使用和不使用
 */

public class ACollectionMapTest {
    /**
     * @description 不使用泛型
     */
    @Test
    public void test1() {
        // 添加学生成绩，成绩一般浮点型，保留两位数
        List students = new ArrayList();
        students.add(95.50);
        students.add(85.50);
        students.add(75.50);
        //1. 问题1：类型不安全。因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功。
        // students.add("Jerry");

        Iterator iterator = students.iterator();
        while(iterator.hasNext()) {
            // java.lang.ClassCastException：class java.lang.Double cannot be cast to class java.lang.Integer
            // 2. 问题2：需要使用强转操作，繁琐。还有可能导致ClassCastException异常。
            Double value = (Double) iterator.next();
            double score = value;
            System.out.println(score);
        }
    }

    /**
     * 在集合中使用泛型的例子
     */
    @Test
    public void test2() {
        List<Integer> students = new ArrayList<>();

        students.add(85);
        students.add(90);
        students.add(80);
        students.add(85);
        students.add(80);
        // 编译报错，保证类型安全
        // students.add("Jerry");

        for (Integer student : students) {
            // 因为添加的都是Integer类型，避免了强转操作
            System.out.println(student);
        }
    }

    /**
     * 泛型在Map中使用的例子
     */
    @Test
    public void test3() {
        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        // JDK7的新特性
        HashMap<String, Integer> map = new HashMap<>(); // 类型推断
        map.put("Jerry", 87);
        map.put("Tom", 99);
        map.put("Alice", 88);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "==>" + value);
            System.out.println(entry);
        }
        System.out.println("---------------------");

        // JDK10新特性
        var entries1 = map.entrySet();
        for(var entry : entries1) {
            System.out.println(entry);
        }

    }
}
