package com.wsw02.self_define.exercise02;

import java.util.*;

/**
 * @author loriyuhv
 * @ClassName Dao
 * @date 2024/3/23 20:32
 * @description TODO
 */

public class DAO<T> {
    Map<String, T> user;

    public DAO() {
    }

    public DAO(Map<String, T> user) {
        this.user = user;
    }

    /**
     * @description 保存 T 类型的对象到 Map 成员变量中
     */
    public void save(String id,T entity) {
        user.put(id, entity);
    }
    
    /** 
     * @description 从 map 中获取 id 对应的对象
     */
    public T get(String id) {
        return user.get(id);
    }

    /**
     * @description 替换 map 中key为id的内容,改为 entity 对象
     */
    public void update(String id,T entity) {
        user.put(id, entity);
    }

    /**
     * @description 返回 map 中存放的所有 T 对象
     */
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = user.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            list.add(entry.getValue());
        }
        return list;
    }

    public void lists() {
        // 错误的
        // Collection<T> values = user.values();
        //System.out.println(values.getClass());
        //List<T> list = (List<T>) values; // 不能转换
        // 正确的方式1
        ArrayList<User> users = new ArrayList<>();
        Collection<T> values = user.values();
        users.addAll((Collection<? extends User>) values);
        System.out.println(users);
    }

    /**
     * @description 删除指定 id 对象
     */
    public void delete(String id) {
        user.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "user=" + user +
                '}';
    }
}
