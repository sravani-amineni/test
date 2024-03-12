package com.sravani;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] + nums[i + 1] == target) {
                result[0] = i;
                result[1] = i + 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] tmp = twoSum(nums, target);
        System.out.println( tmp[0] +" " + tmp[1]);
    }
}
