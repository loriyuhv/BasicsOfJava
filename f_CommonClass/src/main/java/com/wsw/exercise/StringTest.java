package com.wsw.exercise;

/**
 * @author loriyuhv
 * @date 2024/3/13
 * @description TODO
 */

public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");// good and
        System.out.println(ex.ch); //best
    }
}
