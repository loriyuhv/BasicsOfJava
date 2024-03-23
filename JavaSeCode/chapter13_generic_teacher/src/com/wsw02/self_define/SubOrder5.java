package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName SubOrder5
 * @date 2024/3/23 19:21
 * @description 子类不保留父类的泛型(子类泛型参数是新增)
 * 1）没有类型 擦除
 */

public class SubOrder5<T> extends Order<Object, Object> {
    private T description;
    public SubOrder5() {
    }

    public SubOrder5(T description) {
        this.description = description;
    }

    public SubOrder5(Object name, T description) {
        super(name);
        this.description = description;
    }

    public T getDescription() {
        return description;
    }

    public void setDescription(T description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SubOrder5{" +
                "description=" + description +
                '}';
    }
}
