package com.wsw01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description 迭代器操作
 */

public class BIteratorTest {

    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Jerry", 18));
        // 获取迭代器对象
        Iterator iterator = coll.iterator();
        // 方式一
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next()); // 如果超出了集合元素的个数，会报NoSuchElementException

        // 方式二
//        for(int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Jerry", 18));

        Iterator iterator = coll.iterator();
        // 方式一：错误的遍历
//        while((iterator.next()) != null) {
//            System.out.println(iterator.next());
//        }

        // 方式二：错误的遍历
        //每次调用coll.iterator()，都会返回一个新的迭代器对象。
//        while(coll.iterator().hasNext()) {
//            System.out.println(coll.iterator().next());
//        }

    }
}
