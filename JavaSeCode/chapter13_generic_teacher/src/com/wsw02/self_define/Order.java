package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName Order
 * @date 2024/3/23 13:15
 * @description 自定义泛型类，父类Order
 */

public class Order<T, E> {
    private T name;
    private E price;

    public Order() {
    }

    public Order(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public E getPrice() {
        return price;
    }

    public void setPrice(E price) {
        this.price = price;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}

// 以下是子类没有新增泛型

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

/**
 * @description 子类保留父类的泛型
 * 2）部分保留
 */
class SubOrder4<T> extends Order<T, Double> {
    public SubOrder4() {
    }
}

// 以下是子类新增泛型

/**
 * @description 子类不保留父类的泛型
 * 1）没有类型 擦除
 */
class SubOrder5<T> extends Order<Object, Object> {
    public SubOrder5() {
    }
}
