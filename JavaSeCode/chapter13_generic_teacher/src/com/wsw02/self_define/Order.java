package com.wsw02.self_define;

import java.util.ArrayList;
import java.util.Arrays;

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

    // 不是泛型方法
    public T getName() {
        return name;
    }

    // 不是泛型方法
    public E getPrice() {
        return price;
    }

    public void setPrice(E price) {
        this.price = price;
    }

    public void setName(T name) {
        this.name = name;
    }

    /**
     * @description 自定义泛型方法
     */
    public <G> G method(G g) {
        return null;
    }

    // 定义泛型方法，将E[]数组元素添加到对应类型的ArrayList中，并返回
    public <G> ArrayList<G> copyFromArrayToList(G[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    @Override
    public String toString() {
        return "Order{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}