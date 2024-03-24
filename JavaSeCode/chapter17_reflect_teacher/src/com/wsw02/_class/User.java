package com.wsw02._class;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description
 */

public class User implements Fly {
    static {
        System.out.println("Hello User");
    }
    private String[] hobbies;

    @Override
    public void fly() {
        System.out.println("I want to fly.");
    }
}

interface Fly {
    void fly();
}
