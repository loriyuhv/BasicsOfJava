package com.wsw01.use.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description TODO
 */

public class BTest {

    @Test
    public void test() {
        ArrayList<Integer> integers = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            int value = random.nextInt(100) + 1;
//            integers.add(value);
//        }
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (99 + 1));
            integers.add(random);
        }
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
        // 使用
        integers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
