package com.wsw03.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author loriyuhv
 * @date 2024/3/15
 * @description TODO
 */

class Person1{
    public String name;
    public String age;

    public Person1() {
    }

    public Person1(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person1 person1)) return false;
        return Objects.equals(name, person1.name) && Objects.equals(age, person1.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

public class EDemo {

    @Test
    public void test() {
        HashSet set = new HashSet();
        Person1 p1 = new Person1("1001", "AA");
        Person1 p2 = new Person1("1002","BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set); // [Person1{name='1001', age='AA'}, Person1{name='1002', age='BB'}]
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set); // [Person1{name='CC', age='AA'}, Person1{name='1002', age='BB'}]

        set.add(new Person1("1001","CC"));
        System.out.println(set); // [Person1{name='CC', age='AA'}, Person1{name='1001', age='CC'}, Person1{name='1002', age='BB'}]

        set.add(new Person1("1001","AA"));
        System.out.println(set); // [Person1{name='CC', age='AA'}, Person1{name='1001', age='CC'}, Person1{name='1002', age='BB'}]
    }
}
