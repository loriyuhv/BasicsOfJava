package com.wsw03.set;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description TODO
 */

public class BTreeSetDemo {
    @Test
    public void test1() {
        Set set = new TreeSet();

        set.add(8);
        set.add(6);
        set.add(10);
        set.add(7);
        set.add(5);
        System.out.println(set);
    }


}
