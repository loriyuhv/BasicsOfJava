package com.wsw02.self_define;

import org.junit.Test;

import javax.management.OperationsException;
import java.util.ArrayList;

/**
 * @author loriyuhv
 * @ClassName GenericTest
 * @date 2024/3/23 13:12
 * @description 自定义泛型参数测试
 */

public class GenericTest {

    /**
     * @description 测试普通类使用泛型
     */
    @Test
    public void test(){
        Person person = new Person();
        //Person<String> person1 = new Person<>(); // 报错：Person类不是泛型类
    }

    /**
     * @description 我们在声明完自定义泛型类以后，可以在类的内部
     * （比如：属性、方法、构造器中）使用类的泛型。
     */
    @Test
    public void test1(){
        // 实例化时，就可以指明类的泛型参数的类型
        Order<String, Double> order = new Order<>();
        order.setName("apples");
        System.out.println(order);

        /*
         * 泛型参数在指明时，是不可以使用基本数据类型！但是可以使用
         * 包装类替代基本数据类型。
         */
        // Order<int> order1 = new Order<>();



    }

    /**
     * @description 我们在创建自定义泛型类的对象时，可以指明泛型
     * 参数类型。一旦指明，内部凡是使用类的泛型参数的位置，都具体
     * 化为指定的类的泛型类型。
     */
    @Test
    public void test2(){
        Order<Integer, Double> order = new Order<>();
        // order.setName("66"); // 报错，与指定泛型参数类型Integer不符合
        order.setName(66);
        System.out.println(order);
    }

    /**
     * @description 如果在创建自定义泛型类的对象时，没有指明泛型
     * 参数类型，那么泛型将被擦除，泛型对应的类型均按照Object处理
     * ，但不等价于Object。
     */
    @Test
    public void test3(){
        // 向下兼容，JDK5.0之前是没有泛型。
        Order order = new Order(); // Order<Object, Object> order = new Order<>();
        order.setName("apple");
        Object name = order.getName();
        System.out.println(order);
    }

    /**
     * @description 泛型的指定中必须使用引用数据类型。不能使用基本
     * 数据类型，此时只能使用包装类替换。
     */
    @Test
    public void test4(){
        // Order<int, float> order = new Order<int, float>(); // 报错
        Order<Integer, Object> order = new Order<>();
        order.setName(10);
        System.out.println(order);
    }

    // 子类不保留父类的泛型
    /** 
     * @description 子类不保留父类的泛型（子类没有泛型）
     * 1）没有类型，擦除
     */
    @Test
    public void test5(){
        SubOrder1 apple = new SubOrder1();
        apple.setName("apple");
        System.out.println(apple);
    }

    /**
     * @description 子类不保留父类的泛型(子类不是泛型类)
     * 2）具体类型
     */
    @Test
    public void test6(){
        SubOrder2 apple = new SubOrder2();
        apple.setName("apple");
        System.out.println(apple);
    }

    /**
     * @description 子类保留父类的泛型
     * 1）全部保留
     */
    @Test
    public void test7(){
        SubOrder3<String, Double> order = new SubOrder3<>();
        order.setName("grape");
        order.setPrice(18.8);
        System.out.println(order);
    }

    /**
     * @description 子类保留父类的泛型
     * 2）部分保留
     */
    @Test
    public void test8(){
        SubOrder4<String> order = new SubOrder4<>();
        order.setName("purple");
        order.setPrice(9.99);
        System.out.println(order);
    }

    /**
     * @description 子类不保留父类的泛型(子类泛型参数是新增)
     * 1）没有类型 擦除
     */
    @Test
    public void test9(){
        SubOrder5<String> order = new SubOrder5<>();
        order.setDescription("these is sub_order5.");
        System.out.println(order);
    }

    /**
     * @description 子类不保留父类的泛型(子类泛型参数是新增)
     * 2）子类不保留父类的泛型
     */
    @Test
    public void test10(){
        SubOrder6<String> order = new SubOrder6<>();
        String name = order.getName();
        Double price = order.getPrice();
        order.setDescription("sub_order6");
        System.out.println(order);
    }

    /**
     * @description 子类不保留父类的泛型(子类泛型参数是新增)
     * 1)全部保留
     */
    @Test
    public void test11(){
        SubOrder7<String, Double, String> order = new SubOrder7<>();
        order.setName("apple");
        order.setPrice(19.9);
        order.setDescription("this is an apple.");
        System.out.println(order);
    }

    /**
     * @description 子类不保留父类的泛型(子类泛型参数是新增)
     * 1)部分保留
     */
    @Test
    public void test12(){
        SubOrder8<String, String> order = new SubOrder8<>();
        String name = order.getName();
        Double price = order.getPrice();
        String description = order.getDescription();
        System.out.println(name + price + description);
    }

    @Test
    public void test13(){
        Order<String, Integer> order = new Order<>();
        ArrayList<Integer> integers = order.copyFromArrayToList(new Integer[]{1, 2, 3, 4, 5});
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
