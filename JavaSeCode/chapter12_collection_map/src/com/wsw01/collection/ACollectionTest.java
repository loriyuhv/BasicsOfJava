package com.wsw01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * @author loriyuhv
 * @date 2024/3/14
 * @description 测试Collection中方法的使用
 */

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }
}

public class ACollectionTest {

    /**
     * （1）add(E obj)：添加元素对象到当前集合中
     * （2）addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
     */
    @Test
    public void test() {
        Collection coll = new ArrayList();
        //add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add("wsw");
        coll.add(new Object());
        coll.add(new Person("Jack", 12));
        System.out.println(coll);

        //addAll()
        Collection coll1 = new ArrayList();
        coll1.add(new Person("Jerry", 18));
        coll.addAll(coll1);
        System.out.println(coll);

        System.out.println("-----------");
        coll.add(coll1);
        System.out.println(coll);

        //size()
        System.out.println(coll.size());
    }

    /**
     * （3）int size()：获取当前集合中实际存储的元素个数
     * （4）boolean isEmpty()：判断当前集合是否为空集合
     * （5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
     * （6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
     * （7）boolean equals(Object obj)：判断当前集合与obj是否相等
     */
    @Test
    public void test2() {
        Collection coll = new ArrayList();
        //add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add("wsw");
        coll.add(new Object());
        Person p1 = new Person("Jack", 12);
        coll.add(p1);

        //isEmpty()
        System.out.println(coll.isEmpty());
        System.out.println(coll.contains("AA")); // true
        System.out.println(coll.contains(123)); //true
        System.out.println(coll.contains(new Person("Jack", 12)));

        Collection cool1 = new ArrayList();
        cool1.add("AA");
        System.out.println(coll.containsAll(cool1));
        System.out.println(cool1.containsAll(coll));
    }

    /**
     * （8）void clear()：清空集合元素
     * （9） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
     * （10）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
     * （11）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
     */
    @Test
    public void test3() {
        Collection coll = new ArrayList();
        //add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add("wsw");
        coll.add("AA");
        Person p1 = new Person("Jack", 12);
        coll.add(p1);
        System.out.println(coll);
        //clear()
//        coll.clear();
//        System.out.println(coll);
//        System.out.println(coll.size());

        // remove(Object obj)
        // coll.remove(p1);
        coll.remove(new Person("Jack", 12));
        System.out.println(coll);
        coll.remove("AA");
        System.out.println(coll);

        // removeAll(Collection all);
        Collection coll1 = new ArrayList();
        coll1.add("wsw");
        coll1.add("AA");
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    /**
     * （12）Object[] toArray()：返回包含当前集合中所有元素的数组
     * （13）hashCode()：获取集合对象的哈希值
     * （14）iterator()：返回迭代器对象，用于集合遍历
     */
    @Test
    public void test4() {
        Collection coll = new ArrayList();
        //add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add("wsw");
        coll.add(new Person("Jack", 12));
        System.out.println(coll);

        // toArray(); 集合转换数组
        Object[] array = coll.toArray();
        System.out.println(Arrays.toString(array));
    }
}
