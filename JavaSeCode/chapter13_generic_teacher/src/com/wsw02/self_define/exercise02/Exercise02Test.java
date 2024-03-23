package com.wsw02.self_define.exercise02;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName Test
 * @date 2024/3/23 20:43
 * @description 测试类
 * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete
 * 方法来操作 User 对象，使用 Junit 单元测试类进行测试。
 */

public class Exercise02Test {

    @Test
    public void test1(){
        HashMap<String, User> map = new HashMap<>();
        DAO<User> users = new DAO<>(map);

        // save
        User user1 = new User("22013040216", 23, "王思维");
        User user2 = new User("22013040216", 22, "江明东");
        User user3 = new User("22013040215", 19, "谢达斌");
        users.save("22013040216", user1);
        users.save("22013040214", user2);
        System.out.println("-----------------save方法----------------");
        System.out.println(users);

        // get
        User user = users.get("22013040214");
        System.out.println("-----------------get方法-----------------");
        System.out.println(user);

        // update
        user1 = new User("22013040216", 23, "王师维");
        users.update("22013040216", user1);
        System.out.println("-----------------update方法----------------");
        System.out.println(users);

        // list
        List<User> list = users.list();
        System.out.println("-----------------list方法----------------");
        for (User l : list) {
            System.out.println(l);
        }
        // delete
        System.out.println("-----------------delete方法----------------");
        users.delete("22013040216");
        System.out.println(users);
    }

    @Test
    public void test2(){
        HashMap<String, User> map = new HashMap<>();
        DAO<User> users = new DAO<>(map);
        // save
        User user1 = new User("22013040216", 23, "王思维");
        User user2 = new User("22013040216", 22, "江明东");
        User user3 = new User("22013040215", 19, "谢达斌");
        users.save("22013040216", user1);
        users.save("22013040214", user2);
        users.save("22013040215", user3);
        System.out.println("-----------------save方法----------------");
        System.out.println(users);
        users.lists();
    }
}
