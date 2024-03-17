package com.wsw99.test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 加载顺序
 */

class Father {
    static {
        System.out.println("11111111111");
    }
    {
        System.out.println("22222222222");
    }

    public Father() {
        System.out.println("33333333333");

    }

}

public class BSon extends Father {
    static {
        System.out.println("44444444444");
    }
    {
        System.out.println("55555555555");
    }
    public BSon() {
        System.out.println("66666666666");
    }


    public static void main(String[] args) {
        System.out.println("77777777777");
        System.out.println("************************");
        new BSon();
        System.out.println("************************");

        new BSon();
        System.out.println("************************");
        new Father();
    }

}
