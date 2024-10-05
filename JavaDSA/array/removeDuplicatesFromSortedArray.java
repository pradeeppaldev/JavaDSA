package DSA.array;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[j] != nums[i + 1]) {
                nums[j + 1] = nums[i + 1];
                j++;
            }
        }
        return j + 1;
    }
}
