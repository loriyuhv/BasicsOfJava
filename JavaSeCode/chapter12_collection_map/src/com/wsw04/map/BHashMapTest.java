package com.wsw04.map;

import org.junit.Test;

import java.util.*;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description 测试Map实现类
 * 增：
 *     put(Object key, Object value)
 *     putAll(Map m)
 * 删：
 *     Object remove(Object key)
 * 改：
 *     put(Object key, Object value)
 *     putAll(Map m)
 * 查：
 *     Object get(Object key)
 * 长度：
 *     size()
 * 遍历：
 *     遍历key集合：Set keySet()
 *     遍历value集合：Collection values()
 *     遍历entry集合：Set entrySet()
 */

class Person implements Comparable{
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 比如：先比较年龄从小到大排列，如果年龄相同，则继续比较姓名，从大到小
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof Person p) {
            // Person p = (Person) o;
            int value = this.age - p.age;
            if (value != 0) {
                return value;
            }
            return -this.name.compareTo(p.name);
        }
        throw new RuntimeException("输入的类型不匹配！！！");
    }
}

public class BHashMapTest {

    @Test
    public void test1() {
        Map map = new HashMap();
        // put(Object key, Object value)
        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 78);
        map.put("person1", new Person("Jerry", 18));
        System.out.println(map);

        //Object remove(Object key)
        Object aa = map.remove("AA");
        System.out.println(aa);
        System.out.println(map);

        //put(Object key, Object value)
        Object bb = map.put("BB", 99);
        System.out.println(bb);
        System.out.println(map);

        //Object get(Object key)
        Object person1 = map.get("person1");
        System.out.println(person1);
    }

    // map的遍历操作
    @Test
    public void test2() {
        Map map = new HashMap();
        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 78);
        map.put("person1", new Person("Jerry", 18));
        System.out.println(map);
        //遍历key集合：Set keySet()
        Set set = map.keySet();
        for(Object obj : set) {
            System.out.println(obj);
        }
        System.out.println("-------------------");
        //遍历value集合：Collection values()
        Collection values = map.values();
        Iterator iterator = values.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        //遍历entry集合：Set entrySet()
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()) {
            Map.Entry next = (Map.Entry) iterator1.next();
            System.out.println(next.getKey() + "---->" + next.getValue());
            // System.out.println(next);
        }

        System.out.println("-------------");
        for(Object entry : set1) {
            Map.Entry next = (Map.Entry) entry;
            System.out.println(next);
        }

        System.out.println("-------------");
        Iterator iterator2 = set1.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("-------------");
        for(Object a : set1) {
            System.out.println(a);
        }
    }

    @Test
    public void test3() {

    }

    @Test
    public void test4() {

    }

    @Test
    public void test5() {

    }

}
