package com.wsw99.test;

import org.junit.Test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 测试局部变量的作用域
 */

public class ATest {
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        //System.out.println(i); // 报错

    }
}
