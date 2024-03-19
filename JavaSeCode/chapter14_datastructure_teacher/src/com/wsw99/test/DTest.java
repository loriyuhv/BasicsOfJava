package com.wsw99.test;

import java.util.Arrays;

/**
 * @author loriyuhv
 * @ClassName DTest
 * @date 2024/3/19 16:46
 * @description TODO
 */

public class DTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 3, 5, 2};
        int i = removeElement(nums, 3);
        System.out.println(i + Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}



