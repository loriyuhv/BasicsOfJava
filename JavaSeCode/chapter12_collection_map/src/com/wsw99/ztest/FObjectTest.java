package com.wsw99.ztest;

import java.util.Objects;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description TODO
 */

class Person1 extends Object {
    public String name = "Jerry";

    public Person1() {
    }

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person1 person1)) return false;
        return Objects.equals(name, person1.name);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}

class Dog{
    public String name = "Jerry";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class FObjectTest {
    public static void main(String[] args) {
//        int sum = FObjectTest.sum(5);
//        System.out.println(sum);
//        Person1 person1 = new Person1();
//        Person1 person2 = new Person1("Alice");
//        System.out.println("Hello");
//        boolean equals = person1.equals(person2);
//        System.out.println(equals);
//        String str = "Hello";
//        String s = new String("Hello");
//        System.out.println(s == str);
        // String s1 = new String("Hello");
        // System.out.println(s.equals(s1));

//        String str1 = "Hello";
//        String str2 = new String("Hello");
//        String str3 = new String("Hello");
//        System.out.println(str1 == str2); //false
//        System.out.println(str1 == str3); //false
//        System.out.println(str2 == str3); //false
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str2.equals(str3)); //true

//        Integer number = new Integer(1);
//        int number2 = 1;
//        System.out.println(number.equals(number2));
//        System.out.println(number == number2);

//        Person1 person1 = new Person1();
//        Person1 person2 = new Person1();
//        System.out.println(person1.equals(person2));
//        System.out.println(person2.equals(person1));
//        System.out.println(person1.equals(person1));

        Person1 person1 = new Person1();
        Dog dog = new Dog();
        System.out.println(person1.equals(dog));

    }
    public static int sum(Object obj) {
        int sum = 0;
        sum = (Integer)obj + sum;
        return sum;
    }

}
