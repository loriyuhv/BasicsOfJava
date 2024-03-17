package com.wsw99.test;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 对象数组的使用
 */

class Person {
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
}

public class BArrayForObjectTest {

    @Test
    public void test() {
        Person[] people = new Person[5];
        people[0] = new Person("Jerry", 18);
        people[1] = new Person("Tom", 20);
        //people[2].name = "Jack"; // NullPointerException
        for (Person p : people) {
            System.out.println(p);
        }
    }

}
