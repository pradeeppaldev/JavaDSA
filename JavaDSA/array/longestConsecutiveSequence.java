package DSA.array;

import java.util.Arrays;
public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence1(nums));     //Better Approach
    }
    public static int longestSequence1(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;    //This stores the last number that was *one* smaller than the current number
        int count = 1;      //This keeps track of the current length of the consecutive sequence.
        int longest = 1;    //This stores the length of the longest consecutive sequence encountered.
                            // It's initialized to 1 because the smallest possible sequence has at least one element.
        for (int i = 0; i < nums.length; i++) {
//            Handling Consecutive Numbers
            if (nums[i] - 1 == lastSmaller) {   //If the current number (nums[i]) is exactly one more than the last number in the sequence (lastSmaller).
                count++;
                lastSmaller = nums[i];
            }
//            Handling Non-Consecutive Numbers
            if (lastSmaller != nums[i]) {   //It checks if the current number is not part of the consecutive sequence.
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
