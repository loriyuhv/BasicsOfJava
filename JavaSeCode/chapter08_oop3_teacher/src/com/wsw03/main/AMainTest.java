package com.wsw03.main;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description TODO
 */

public class AMainTest {
    // 程序的入口
    public static void main(String[] args) {
        String[] arr = new String[]{"Jerry", "Tom"};
        Main.main(arr);
    }
}

class Main{
    // 看做是普通的静态方法
    public static void main(String[] args) {
        System.out.println("Main的main()的调用！！！");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
