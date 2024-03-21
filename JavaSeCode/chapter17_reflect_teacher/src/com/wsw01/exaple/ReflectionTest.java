package com.wsw01.exaple;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description 使用反射和不使用反射的区别？
 */

public class ReflectionTest {
    /**
     * 使用反射之前可以执行的操作
     */
    @Test
    public void test() {
        // 1. 创建Person类的实例
        // public Person();
        Person p1 = new Person();

        // 2. 调用属性
        // public int age;
        p1.age = 10;
        System.out.println(p1.age);

        // 3. 调用方法
        // public void show();
        p1.show();
    }

    /**
     * 使用反射完成上述的操作
     */
    @Test
    public void test2() throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        // 1. 创建Person类的实例
        // public Person();
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        // 2. 调用属性
        // public int age;
        Field age = clazz.getField("age");
        age.set(p1, 10);
        System.out.println(age.get(p1));

        // 3. 调用方法
        // public void show();
        Method show = clazz.getMethod("show");
        show.invoke(p1);
    }

    /**
     * 出了Person类之后，就不能直接调用Person类中声明的private
     * 权限修饰的结构（属性、方法）但是，我们可以通过反射的方式，
     * 调用Person类中私有的结构。
     */
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 1. 调用私有的构造器，创建类的实例
        // private Person(String name, int age)
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Person jerry = constructor.newInstance("Jerry", 18);
        System.out.println(jerry.age);

        // 2. 调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(jerry));

        // 3. 调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String info = (String) showNation.invoke(jerry, "中国");
        System.out.println(info);
    }

    @Test
    public void test4() {
        Person person = new Person();
        if (person.getClass() == Person.class) {
            System.out.println("Hello world!!!");
        }
        System.out.println(person.getClass());
        System.out.println(Person.class);

    }
}
