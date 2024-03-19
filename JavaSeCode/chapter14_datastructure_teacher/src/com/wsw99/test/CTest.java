package com.wsw99.test;

import java.util.HashMap;

/**
 * @author loriyuhv
 * @ClassName CTest
 * @date 2024/3/19 10:27
 * @description TODO
 */

public class CTest {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1, 7};
//        int search = search(nums, 7);
        int search = search(nums, 7);
        System.out.println(search);
    }
    public static int search1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Integer integer = map.get(target);

        if (integer == null) {
            return -1;
        } else {
            return integer;
        }
    }

    public static int search(int[] nums, int target) {
        // 1. 先取数组最左边的数的下标left = 0; 再取数组最右边的数的下标right=nums.length - 1;
        int left = 0, right = nums.length - 1;

        // 2. 通过循环条件，让左边数组下标left的数永远小于右边数组下标right的数。
        while (left <= right) {
            // 1. 取得中间的数下标mid mid = (right - left) / 2 + left; // + left确保mid永远在right的右边，并且不为0。
            int mid = (right - left) / 2 + left;
            int num = nums[mid];

            // 2.判断下标mid的数是否等于target 等于返回下标
            if (num == target) {
                return mid;
            } else if (num > target) { // 判断下标mid的数是否大于target 大于：right = mid - 1;
                right = mid - 1;
            } else {        // 判断下标mid的数是否小于target， 小于：left = mid + 1;
                left = mid + 1;
            }
        }
        // 3. 都不满足就返回-1;
        return -1;
    }
}
