package com.wsw01.exaple;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author loriyuhv
 * @ClassName BTest
 * @date 2024/3/23 10:40
 * @description 体会使用反射和不使用反射的区别：
 */

class Student {
    public String name;
    private int age;

    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("I am a student.");
    }

    private void getHobbies() {
        System.out.println("One of " + name + "'s hobbies is playing basketball.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class BTest {

    /**
     * @description 不使用反射
     */
    @Test
    public void test1(){
        // 1. 调用公共构造器，创建Student类的实例
        Student student = new Student();
        System.out.println(student);

        // 2. 调用公共属性
        student.name = "Jerry";
        System.out.println(student.name);

        // 3. 调用公共方法
        student.display();
    }

    /**
     * @description 使用反射，实例化Student类，并且调用公共构造器，公共属性和方法。
     */
    @Test
    public void test2() throws InstantiationException, IllegalAccessException {
        // 1. 通过公共构造器，实例化Student类
        Class<Student> clazz = Student.class;
        Student student = clazz.newInstance();
        System.out.println(student);

        // 2. 调用公共属性
        student.name = "Jerry";
        System.out.println(student.name);

        // 3. 调用公共方法
        student.display();
    }

    /**
     * @description 使用反射，实例化Student类，并且调用私有构造器，私有属性和方法。
     */
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Student> clazz = Student.class;

        // 1. 通过私有构造器方法，实例化Student类。
        Constructor<Student> cons = clazz.getDeclaredConstructor(String.class, int.class);
        cons.setAccessible(true);
        Student student = cons.newInstance("Jerry", 18);
        System.out.println(student);

        // 2. 调用私有属性。
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(student, 20);
        System.out.println(age.get(student));

        // 3. 调用私有方法
        Method getHobbies = clazz.getDeclaredMethod("getHobbies");
        getHobbies.setAccessible(true);
        getHobbies.invoke(student);

        Student Tom = cons.newInstance("Tom", 15);
        System.out.println(Tom);
        age.set(Tom, 18);
        System.out.println(age.get(Tom));
        getHobbies.invoke(Tom);
    }
}
