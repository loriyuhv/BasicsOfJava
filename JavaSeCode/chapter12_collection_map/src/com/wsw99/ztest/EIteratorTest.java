package com.wsw99.ztest;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description 迭代器修改临时变量情况
 */

public class EIteratorTest {

    @Test
    public void test() {
        String[] strings = new String[]{"Jerry", "Jack", "Marry"};

//        for(int i = 0; i < strings.length; i++){
//            strings[i] = "Hello";
//        }

        for (String string : strings) {
            string = "Hello";
        }

        for(String string : strings) {
            System.out.println(string);
        }
    }
}
