package com.wsw02.list;

import org.junit.Test;

import java.util.*;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description List使用
 */

class Person {
    String name;
    int age;

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
}

public class AListTest {

    @Test
    public void test1() {
        List list = new ArrayList();

        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(new Person("Jerry", 18));
        System.out.println(list);

        //add(int index, Object element)
        list.add(2, "CC");
        System.out.println(list);

        //addAll(int index, Collection elements)
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(1, list1);
        System.out.println(list);

        // list.add(1, list1); // 将list1整体作为一个元素，插入到索引1的位置
        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = new ArrayList();

        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(2);
        list.add(new Person("Jerry", 18));
        System.out.println(list);

        // 删除索引2的元素
        list.remove(2);
        System.out.println(list);

        //删除对象内容为2的元素
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    @Test
    public void test3() {
        List list = new ArrayList();

        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(2);
        list.add(new Person("Jerry", 18));
        System.out.println(list);

        //遍历1：使用迭代器
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //遍历2：使用增强for循环
//        for (Object list1: list) {
//            System.out.println(list1);
//        }

        // 遍历3：一般的for循环
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
