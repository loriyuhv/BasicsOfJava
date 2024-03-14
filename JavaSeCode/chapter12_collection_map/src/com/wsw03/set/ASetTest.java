package com.wsw03.set;

import org.junit.Test;

import java.util.*;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description TODO
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

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class ASetTest {

    @Test
    public void test1() {
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 18));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(set.contains(new Person("Tom", 18)));
    }

    @Test
    public void test2() {
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 18));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
