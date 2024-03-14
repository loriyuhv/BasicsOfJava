package com.wsw.test;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description TODO
 */

class Student {
    public int age;
    public float score;

    public Student(int age, float score) {
        this.age = age;
        this.score = score;
    }
}

public class ATest {
    public static void main(String[] args) {
        Student LiHua = new Student(18, 95.00F);
        System.out.println(LiHua);

    }
}
