package com.wsw01.array;

/**
 * @author loriyuhv
 * @date 2024/3/18
 * @description 数据结构————实现数据
 */
public class AArrayDemo {
    public static void main(String[] args) {
        Array array = new Array(10);
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        array.print();

        boolean delete = array.delete(9);
        System.out.println(delete);
    }
}

class Array {
    private final Object[] elementData;
    private int size;

    public Array(int capacity) {
        elementData = new Object[capacity];
    }

    /**
     * @description 添加元素
     */
    public void add(Object value) {
        if (size >= elementData.length) {
            throw new RuntimeException("数组已满，不可添加");
        }
        elementData[size] = value;
        size++;
    }


    /**
     * @description 查询元素value在数组中的索引位置
     */
    public int find(Object value) {

        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @description 查询元素value在数组中的索引位置
     */
    public boolean delete(Object value) {

        int index = find(value);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size - 1] = null;
        size--;
        return true;
    }

    /**
     * @description 遍历元素
     */
    public void print() {
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            if (i == (size - 1)) {
                System.out.println(elementData[i] + "}");
                break;
            }
            System.out.print(elementData[i] + ", ");
        }
    }

}
