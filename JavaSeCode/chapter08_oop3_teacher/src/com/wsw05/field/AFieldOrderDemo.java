package com.wsw05.field;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 显式初始化和代码块中初始化（同级别按先后顺序执行）
 */

class Student {
    String name = "Jerry";
    {
        name = "Tom";
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}

class Teacher {
    {
        name = "Tom";
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    String name = "Jerry";
}

public class AFieldOrderDemo {
    public static void main(String[] args) {
        // 测试显式初始化和代码块中初始化（同级别按先后顺序执行）
        Student student = new Student();
        System.out.println(student.name);
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
    }
}
