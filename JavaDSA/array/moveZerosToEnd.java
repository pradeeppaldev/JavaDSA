package DSA.array;

import java.util.Arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        zeroAtEnd(nums);
    }
    public static void zeroAtEnd(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
