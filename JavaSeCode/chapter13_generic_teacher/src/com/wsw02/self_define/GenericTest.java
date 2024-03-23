package com.wsw02.self_define;

import org.junit.Test;

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

    /**
     * @description 除创建泛型类对象外，子类继承泛型类时、实现类
     * 实现泛型接口时，也可以确定泛型结构中的泛型参数。
     */
    @Test
    public void test5(){
        SubOrder jerry = new SubOrder("Jerry", "This is Jerry.");
        String name = jerry.getName();
        System.out.println(jerry);
    }
    
    /** 
     * @description 子类不保留父类类型：1）没有类型，擦除
     */
    @Test
    public void test6(){
        SubOrder1 apple = new SubOrder1("apple");
        Object name = apple.getName();
        System.out.println(apple);
    }

    /**
     * @description 子类不保留父类的泛型(子类不是泛型类)
     * 2）具体类型
     */
    @Test
    public void test7(){
        SubOrder2 apple = new SubOrder2("apple");
        String name = apple.getName();
        System.out.println(name);
    }

    @Test
    public void test8(){

    }



//    /**
//     * @description 测试Order子类Information使用泛型
//     */
//    @Test
//    public void test3(){
//        Information<String, Integer> apple = new Information<>("apple", "This is an apple.");
//        apple.name = "apples";
//        apple.description = "these apples are sweet.";
//        System.out.println(apple);
//        apple.displayPrice(15);
//    }
//
//    /**
//     * @description 测试Order子类SubOrder使用父类泛型
//     */
//    @Test
//    public void test4(){
//        // 实例化SubOrder
//        SubOrder subOrder = new SubOrder();
//        Object age = subOrder.getAge();
//
//        // 因为SubOrder不是泛型类，此处编译错误
//        // SubOrder<String> subOrder = new SubOrder<>();
//    }
//
//    /**
//     * @description 测试Order子类SubOrder2使用父类泛型
//     */
//    @Test
//    public void test5(){
//        SubOrder2 subOrder2 = new SubOrder2();
//        String age = subOrder2.getAge();
//
//    }
//
//    /**
//     * @description 测试Order子类SubOrder3使用泛型参数，以及定义父类泛型参数为String
//     */
//    @Test
//    public void test6(){
//        SubOrder4<Integer> apple = new SubOrder4<>("apple", 99);
//        System.out.println(apple);
//        System.out.println(apple.getDescription().getClass());
//    }
}
