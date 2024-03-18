package com.wsw13.idea.debug;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author loriyuhv
 * @date 2024/3/18
 * @description 方法断点
 */

public class BDebug02 {
    public static void main(String[] args) {

        //1.
        Son instance = new Son();
        instance.test();

        //2. 类的多态性
        Father instance1 = new Son();
        instance1.test();

        //3. 接口的多态性
        Consumer con = new ConsumerImpl();
        con.accept("wsw");

        //4.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom",12);
        map.put("Jerry",11);
        map.put("Tony",20);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry + " ");
        }
        System.out.println();
    }
}

class Father{
    public void test(){
        System.out.println("Father : test");
    }
}

class Son extends Father{
    public void test(){
        System.out.println("Son : test");
    }
}

interface Consumer{
    void accept(String str);
}

class ConsumerImpl implements Consumer{

    @Override
    public void accept(String str) {
        System.out.println("ConsumerImple:" + str);
    }
}

