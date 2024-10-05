package DSA.array;

import java.util.Arrays;

public class rotateArraybyK {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;    //if k is larger than the array's length, it doesn't perform unnecessary rotations.
                                //if nums.length = 5 and k = 6, rotating by 6 positions is equivalent to rotating by 1 position (6 % 5 = 1).
//        storing the first k elements of nums[] in temp[]
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
//        moving all the elements of index greater then k (k+1,k+2,k+3,...nums.length) at index 0,1,2,3,...k
        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }
//        placing elements of temp[] at the end of nums
        for (int i = nums.length - k; i < nums.length; i++) {
            nums[i] = temp[i - (nums.length - k)];
        }
    }
}
