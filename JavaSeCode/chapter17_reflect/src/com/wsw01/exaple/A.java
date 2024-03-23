package com.wsw01.exaple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName A
 * @date 2024/3/23 9:59
 * @description 为什么声明多态的对象.getClass()会得到子类的类信息。
 * 比如：以下代码打印为：
 * class java.util.ArrayList
 * class java.lang.String
 */

public class A {
    @Test
    public void test1(){
        Object object = new String("Hello");
        List<Integer> integers = new ArrayList<>();
        System.out.println(integers.getClass());
        System.out.println(object.getClass());
    }
}
