package com.wsw02.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description TODO
 * - 定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
 * - 使用ArrayList集合，保存录入的多个学生对象。
 * - 循环录入的方式，1：继续录入，0：结束录入。
 * - 录入结束后，用foreach遍历集合。
 */

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class BListExercise {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true) {
            System.out.println("---------欢迎登录学生信息管理系统---------");
            System.out.println("1：继续录入");
            System.out.println("0：结束录入");
            System.out.print("请输入数字：");
            int input = scanner.nextInt();
            if (input == 1) {
                Student student = new Student();
                System.out.println("---------------录入学生信息---------------");
                System.out.print("学生姓名：");
                String name = scanner.next();
                student.setName(name);
                System.out.print("学生年龄：");
                int age = scanner.nextInt();
                student.setAge(age);
                students.add(student);

                System.out.println("---------------学生信息---------------");
                for (Student student1 : students) {
                    System.out.println(student1);
                }
                Thread.sleep(2000);

            } else if (input == 0) {
                System.out.println("-----欢迎再登录学生信息管理系统!!!");
                break;
            }
        }
    }


    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1：继续录入");
        System.out.println("0：结束录入");
        System.out.println("请输入数字：");
//        int input = scanner.nextInt();
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("录入学生信息：");
        } else if (input.equals("0")) {
            System.out.println("结束学生信息录入：");
        }

    }
}
