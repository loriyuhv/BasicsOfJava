package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName SubOrder7
 * @date 2024/3/23 19:35
 * @description 子类不保留父类的泛型(子类泛型参数是新增)
 * 1)全部保留
 */

public class SubOrder7<T, E, U> extends Order<T, E> {
    private U description;

    public SubOrder7() {
    }

    public SubOrder7(U description) {
        this.description = description;
    }

    public SubOrder7(T name, U description) {
        super(name);
        this.description = description;
    }

    public U getDescription() {
        return description;
    }

    public void setDescription(U description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SubOrder7{" +
                "description=" + description +
                '}';
    }
}
