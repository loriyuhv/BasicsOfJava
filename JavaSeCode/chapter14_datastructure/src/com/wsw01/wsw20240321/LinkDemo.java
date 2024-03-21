package com.wsw01.wsw20240321;

/**
 * @author loriyuhv
 * @date 2024/3/21
 * @description 单向链表练习
 */

public class LinkDemo {

}

/**
 * 单链表的节点：节点是链表的基本单位
 * 每个节点Node有两个属性：
 *      数据域：Object data
 *      指针域：Node next
 */
class Node {
    // 存储结点的数据
    public Object data;
    // 存储下一结点的地址
    public Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

/**
 * 链表类：单向链表
 */
class Link {
    // 头结点
    public Node header;

    private int size;

    public int size() {
        return size;
    }

    // 向链表中添加元素的方法（表尾添加）
    public void add(Object data) {
        /**
         * 创建一个新的节点对象，让之前单链表的末节点next指向新节点对象。
         * 注意：之前的节点可能是第一个，也可能是第二个......
         */
        if (header == null) {
            // 说明还没有节点；
            header = new Node(data, null); // new一个新的节点对象，作为头节点对象。
            // 这时候的头结点既是头节点，又是尾节点。
        } else {
            // 说明头节点不为空，头节点存在了
            Node currentLastNode = findLast(header); // 找出当前末尾节点，作为
            currentLastNode.next = new Node(data, null);
        }

    }

    private Node findLast(Node node) {
        if (node.next == null) {
            return node;
        }
        return findLast(node.next);
    }
}


