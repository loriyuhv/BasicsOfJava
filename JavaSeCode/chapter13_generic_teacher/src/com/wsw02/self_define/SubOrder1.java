package com.wsw02.self_define;

/**
 * @author loriyuhv
 * @ClassName SubOrder1
 * @date 2024/3/23 19:04
 * @description 子类不保留父类的泛型(子类不是泛型类)
 * 1) 没有类型，擦除
 * */


public class SubOrder1 extends Order<Object, Object> {
    public SubOrder1() {

    }
}
