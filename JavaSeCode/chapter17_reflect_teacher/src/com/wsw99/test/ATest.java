package com.wsw99.test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @ClassName ATest
 * @date 2024/3/22 20:27
 * @description TODO
 */

public class ATest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 1. 自定义一个类加载器
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    // 1）通过类的全名，获取类的二进制数据流
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };


        // 2. 利用自定义类加载器加载User类，并生成一个对象实例；selfLoader
        Object selfLoader = myLoader.loadClass("com.wsw99.test.User").newInstance();
        System.out.println(selfLoader.getClass());

        // 3. 判断selfLoader是否为User类的实例（注意：这里User是系统加载器加载的）
        System.out.println(selfLoader instanceof User);
    }
}
