package com.wsw02._class;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * @author loriyuhv
 * @ClassName ClassTest
 * @date 2024/3/24 10:06
 * @description 获取Class实例的几种方式
 */

public class ClassTest {

    /**
     * @description 获取Class实例的几种方式
     */
    @Test
    public void test1() throws ClassNotFoundException {
        // 1. 调用运行时类的静态属性：class
        Class<User> clazz1 = User.class;
        System.out.println(clazz1);

        // 2. 调用运行时类的对象的getClass()方法
        User user = new User();
        Class<? extends User> clazz2 = user.getClass();
        System.out.println(clazz2);
        //System.out.println(clazz1 == clazz2); // true

        // 3. 调用Class的静态方法forName(String className) 使用场景最多，更容易体现动态性
        String className = "com.wsw02._class.User"; // 全类名
        Class<?> clazz3 = Class.forName(className);
        //System.out.println(clazz2 == clazz3); // true

        // 4. 使用类加载器的方式 (了解，因为3跟4的使用场景都是一样的)
        Class<?> clazz4 = ClassLoader.getSystemClassLoader().loadClass(className);
        // System.out.println(clazz3 == clazz4); // true

    }

    @Test
    public void test2(){
        Class<Object> c1 = Object.class;
        Class<Comparable> c2 = Comparable.class;
        Class<String[]> c3 = String[].class;
        Class<int[][]> c4 = int[][].class;
        Class<ElementType> c5 = ElementType.class;
        Class<Override> c6 = Override.class;
        Class<Integer> c7 = int.class;
        Class<Void> c8 = void.class;
        Class<Class> c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class<? extends int[]> c10 = a.getClass();
        Class<? extends int[]> c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class<User> clazz = User.class;
        Class<?> clazz2 = Class.forName("com.wsw02._class.User");
        String name = clazz2.getName();
        System.out.println(name);
        System.out.println(clazz2.getSuperclass());
        Class<?>[] interfaces = clazz2.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i]);
        }


    }
}
