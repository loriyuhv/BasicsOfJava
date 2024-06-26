package com.wsw02._class;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author loriyuhv
 * @ClassName ClassLoaderTest
 * @date 2024/3/24 11:49
 * @description 系统类加载器测试
 */

public class ClassLoaderTest {
    /**
     * @description 在JDK8中执行如下的代码
     */
    @Test
    public void test1(){
        // 获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);

        // 获取扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        // 获取引导类加载器：失败
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3); // null
    }

    @Test
    public void test2() throws ClassNotFoundException {
        // 用户自定义的类使用的是系统加载类加载的
        Class<User> clazz = User.class;
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2
        // 使用引导类加载器加载
        Class<?> clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader1 = clazz2.getClassLoader();
        System.out.println(classLoader1);

    }

    /**
     * @description 需求：通过ClassLoader加载指定的配置文件
     */
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();
        // 通过类的加载器读取的文件的默认路径为：当前module下src下
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        pros.load(resourceAsStream);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name + "=" + password);
    }

    /**
     * @description Properties: 处理属性文件
     */
    @Test
    public void test4() throws IOException {

        Properties pros = new Properties();
        // 通过类的加载器读取的文件的默认路径为：当前module
        FileInputStream fis = new FileInputStream(new File("info.properties"));

        pros.load(fis);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name + ":" + password);
    }
}
