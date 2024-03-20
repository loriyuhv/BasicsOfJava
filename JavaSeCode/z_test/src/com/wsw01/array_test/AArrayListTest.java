package com.wsw01.array_test;

import java.util.ArrayList;

/**
 * 1) ArrayList扩容发生在调用add()方法的时候。
 * 2) 首先，调用ensureCapacityInternal()方法来扩容, 通过calculateCapacity()
 *  方法获取需要扩容的长度, 作为参数传入ensureExplicitCapacity()方法来判断数
 *  组是否需要扩容。
 * 3）ArrayList扩容的关键方法：grow()获取到ArrayList中elementData数组内存空
 *  间的长度，扩容至原来的1.5倍。
 * 4）调用Arrays.copyOf方法将elementData数组指向新的内存空间，newCapacity的
 *  连续空间。从此方法我们可以清晰地看出其实ArrayList扩容的本质就是计算出新的
 *  扩容数组的size后实例化，并将原有的数组内容复制到新数组中去。
 */

public class AArrayListTest {
    public static void main(String[] args) {
        // 声明数组，没有初始化
        ArrayList<Integer> integers = new ArrayList<>();


        // integers.add(1);
        // 1) ArrayList扩容发生在调用add()方法的时候。

        // ensureCapacityInternal(int minCapacity);
        // calculateCapacity(Object[] elementData, int minCapacity);
        // ensureExplicitCapacity(int minCapacity);
        // 2) 首先，调用ensureCapacityInternal()方法来扩容, 通过calculateCapacity()
        //      方法获取需要扩容的长度, 作为参数传入ensureExplicitCapacity()
        //      方法来判断数组是否需要扩容。

        /**
         * grow(int minCapacity) {
         *      int oldCapacity = elementData.length;
         *      int newCapacity = oldCapacity + (oldCapacity >> 1);
         *      elementData = Arrays.copyOf(elementData, newCapacity);
         * }
         */
        // 3）ArrayList扩容的关键方法：grow()获取到ArrayList中elementData数组内存空间
        //      的长度，扩容至原来的1.5倍。
        /**
         * copy = new Object[newLength];
         * System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
         */
        // 4）调用Arrays.copyOf方法将elementData数组指向新的内存空间，newCapacity的连续空间。
        //      从此方法我们可以清晰地看出其实ArrayList扩容的本质就是计算出新的扩容数组的size
        //      后实例化，并将原有的数组内容复制到新数组中去。
        //
        //
        //
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        // 1）
        integers.add(11);
        integers.add(1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
