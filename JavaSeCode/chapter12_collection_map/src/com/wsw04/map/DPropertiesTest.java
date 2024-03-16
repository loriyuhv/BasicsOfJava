package com.wsw04.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description Properties的使用
 */

public class DPropertiesTest {
    public static void main(String[] args) {
        File file = new File("info.properties");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
    }

    @Test
    public void test() throws IOException {
        // 注意，要提前创建好info.properties
        File file = new File("info.properties");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);

        FileInputStream fileInputStream = new FileInputStream(file);
        Properties pro = new Properties();

        // 加载流中文件中的数据
        pro.load(fileInputStream);

        // 读取数据
        String name = pro.getProperty("name");
        String password = pro.getProperty("password");
        System.out.println(name + ":" + password);

        // 关闭流
        fileInputStream.close();
    }
}
