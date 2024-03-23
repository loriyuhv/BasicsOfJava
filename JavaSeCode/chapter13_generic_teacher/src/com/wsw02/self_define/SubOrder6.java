package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName SubOrder6
 * @date 2024/3/23 19:28
 * @description 子类不保留父类的泛型(子类泛型参数是新增)
 * 2）子类不保留父类的泛型
 */

public class SubOrder6<T> extends Order<String, Double> {
    private T description;

    public SubOrder6() {
    }

    public SubOrder6(String name) {
        super(name);
    }

    public SubOrder6(T description) {
        this.description = description;
    }

    public SubOrder6(String name, T description) {
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
        return "SubOrder6{" +
                "description=" + description +
                '}';
    }
}
