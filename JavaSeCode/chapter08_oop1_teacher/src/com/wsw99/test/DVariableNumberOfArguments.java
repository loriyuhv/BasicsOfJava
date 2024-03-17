package com.wsw99.test;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description 可变个数的参数
 */


public class DVariableNumberOfArguments {
    public static void main(String...args) {
        char separator = '>';
        DVariableNumberOfArguments d = new DVariableNumberOfArguments();
        String apple = d.concatenate(separator, "apple", "flavor", "grape");
        System.out.println(apple);
    }

    public String concatenate(char separator, String... args) {
        String strings = "";
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                strings += args[0];
            }
            if (i != 0) {
                strings = strings + separator + args[i];
            }

        }
        return strings;
    }

}
