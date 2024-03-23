package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName SubOrder8
 * @date 2024/3/23 19:35
 * @description 子类保留父类的泛型(子类泛型参数是新增)
 * 1)部分保留
 */

public class SubOrder8<T, E> extends Order<T, Double> {
    private E description;

    public SubOrder8() {
    }

    public SubOrder8(E description) {
        this.description = description;
    }

    public SubOrder8(T name, E description) {
        super(name);
        this.description = description;
    }

    public E getDescription() {
        return description;
    }

    public void setDescription(E description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SubOrder8{" +
                "description=" + description +
                '}';
    }
}
