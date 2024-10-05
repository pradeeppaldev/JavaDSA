package DSA.array;

import java.util.Arrays;

public class dutchNationalFlag_Sort012 {
        public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(nums)));
    }
        public static int[] sort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high){
            if (nums[mid] == 0){
                swap(nums , low , mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums , mid , high);
                high--;
            }
        }
        return nums;
    }

        static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
