package com.wsw03.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author loriyuhv
 * @date 2024/3/15
 * @description 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 */

public class CRandomTest {

    @Test
    public void test() {
        Random random = new Random();
        Set<Integer> integers = new HashSet<Integer>();
        while (integers.size() < 10) {
            int number = random.nextInt(20) + 1;
            System.out.println(number);
            integers.add(number);
        }
        for (Integer integer: integers) {
            System.out.println(integer);
        }


    }
}
