package com.wsw01.array;

/**
 * @author loriyuhv
 * @ClassName CLinkDemo
 * @date 2024/3/18 21:39
 * @description 单链表实现
 */

public class CLinkDemo {
    public static void main(String[] args) {
        Link<String> link = new Link<>();
        link.add("Jerry");
        link.add("Tom");
        link.add("Jack");
        link.add("Alice");
        link.add("Edward");

        link.makeTraverse();
    }
}

/**
 * @description 单向链表中的节点，节点是单向链表中的基本单元
 * 每一个节点Node都有两个属性：1）数据域 2）指针域
 */
class Node {
    // 存储的数据
    Object data;

    // 下一节点的内存地址
    Node next;

    public Node() {}

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

/** 
 * @description 链表类（单向链表）
 */
class Link<E> {
    // 头节点
    Node header;

    private int size;

    public int size() {
        return size;
    }

    /**
     * @description 向链表增加元素
     */
    public void add(E data) {
        // 创建一个新的节点对象
        // 让之前单链表的末尾节点next指向新节点的对象
        // 有可能这个元素是第一个，也可能是第二个，也可能是第三个
        if (header == null) {
            // 说明还没有节点。
            // new 一个新节点对象，作为头节点对象
            // 这个时候头节点既是一个头节点，也是一个尾节点
            this.header = new Node(data, null);
        } else {
            // 说明头节点不是空
            // 头节点已经存在了
            // 找出当前末尾节点，让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }

    /**
     * @description 专门查找尾节点的方法
     */
    private Node findLast(Node node) {
        if (node.next == null) {
            // 如果一个节点的next是null
            // 说明这个节点就是末尾节点
            return node;
        }
        // 程序能到这里，说明node不是末尾节点
        return findLast(node.next);
    }

    /**
     * @description 遍历链表元素
     */
    public void makeTraverse() {
        if (this.header == null) {
            System.out.println("链表为空！！！");
            return;
        }
        Node p = this.header;
        while(p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
