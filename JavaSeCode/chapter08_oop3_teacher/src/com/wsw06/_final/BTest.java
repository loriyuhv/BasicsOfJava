package com.wsw06._final;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 排错
 */

class Test1 {
    public static int addOne(int x) {
        // return ++x;
        return x++;
    }
}

public class BTest {

    @Test
    public void test() {
        int i = Test1.addOne(1);
        System.out.println(i);
    }
}
