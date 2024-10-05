package DSA.array;

import java.util.Arrays;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
*/
public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2, 4, 4};
        System.out.println(findSingleNumber(nums));
    }

    public static int findSingleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int j = 1;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i = i + 2) {
            if (nums[i] != nums[j]) {
                return nums[i];
            }
            j++;
        }
        return -1;
    }
}
