package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName Order
 * @date 2024/3/23 13:15
 * @description 自定义泛型类，父类Order
 */

public class Order<T, E> {
    private T name;

    public Order() {
    }

    public Order(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name=" + name +
                '}';
    }
}

/**
 * @description 子类不保留父类的泛型
 */
class SubOrder extends Order<String, Object> {
    private String description;

    public SubOrder(String description) {
        this.description = description;
    }

    public SubOrder(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SubOrder{" +
                "description='" + description + '\'' +
                '}';
    }
}

/** 
 * @description 子类不保留父类的泛型(子类不是泛型类)
 * 1) 没有类型，擦除
 */
class SubOrder1 extends Order<Object, Object> {
    public SubOrder1() {
    }

    public SubOrder1(Object name) {
        super(name);
    }
}

/**
 * @description 子类不保留父类的泛型(子类不是泛型类)
 * 2）具体类型
 */
class SubOrder2 extends Order<String, Integer> {
    public SubOrder2() {
    }

    public SubOrder2(String name) {
        super(name);
    }
}

/**
 * @description 子类保留父类的泛型（子类是泛型类）
 * 1）全部保留
 */
class SubOrder3<T, E> extends Order<T, E> {
    public SubOrder3() {
    }

    public SubOrder3(T name) {
        super(name);
    }
}
///**
// * @description 除创建泛型类对象外，子类继承泛型类时、实现类实现泛型接口时，
// *  也可以确定泛型结构中的泛型参数。
// *  子类是泛型类，子类泛型参数T继承父类泛型参数类型，泛型参数E为新增。父类泛型参数为T
// */
//class Information<T, E> extends Order<T> {
//    T description;
//    E price;
//
//    public Information() {
//    }
//
//    public Information(T name, T description) {
//        super(name);
//        this.description = description;
//    }
//
//    public void displayPrice (E price) {
//        System.out.println(super.name + "'s price is " + price + ". Because " + this.description);
//    }
//
//    @Override
//    public String toString() {
//        return "Information{" +
//                "description=" + description +
//                ", name=" + name +
//                '}';
//    }
//}
//
///**
// * @description 子类是泛型类，泛型参数是T
// */
//class SubOrder4<T> extends Order<String> {
//    private T description;
//
//    public SubOrder4() {
//    }
//
//    public SubOrder4(T description) {
//        this.description = description;
//    }
//
//    public SubOrder4(String name, T description) {
//        super(name);
//        this.description = description;
//    }
//
//    public T getDescription() {
//        return description;
//    }
//
//    public void setDescription(T description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "SubOrder4{" +
//                "description=" + description +
//                ", name=" + name +
//                '}';
//    }
//}