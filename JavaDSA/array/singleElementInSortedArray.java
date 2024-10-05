package DSA.array;
public class singleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        // Iterate through the array checking pairs
        for (int i = 1; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return -1; // If no single element is found
    }
}
