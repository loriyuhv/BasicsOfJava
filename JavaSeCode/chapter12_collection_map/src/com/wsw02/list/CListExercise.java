package com.wsw02.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description TODO
 * 1、请定义方法public static int listTest(Collection list,String s)
 *      统计集合中指定元素出现的次数
 * 2、创建集合，集合存放随机生成的30个小写字母
 * 3、用listTest统计，a、b、c、x元素的出现次数
 */

public class CListExercise {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<Character>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char ch = (char)(random.nextInt(26) + 97);
            characters.add(ch);
        }
        System.out.println(characters);
        int aCount = CListExercise.listTest(characters, 'a');
        int bCount = CListExercise.listTest(characters, 'b');
        int cCount = CListExercise.listTest(characters, 'c');
        int xCount = CListExercise.listTest(characters, 'x');
        System.out.println("a的个数：" + aCount);
        System.out.println("b的个数：" + bCount);
        System.out.println("c的个数：" + cCount);
        System.out.println("x的个数：" + xCount);

    }

    public static int listTest(Collection<Character> collection, Character character) {
        int count = 0;
        for (Character character1 : collection) {
            if (character1.equals(character)) {
                count++;
            }
        }
        return count;
    }
}
