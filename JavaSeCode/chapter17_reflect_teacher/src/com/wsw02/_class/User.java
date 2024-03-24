package com.wsw02._class;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description
 */

public class User implements Fly {
    private String[] hobbies;

    @Override
    public void fly() {
        System.out.println("I want to fly.");
    }
}

interface Fly {
    void fly();
}
