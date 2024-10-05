package DSA.array;

public class kadaneAlgo_maximumSubArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 5, 6};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
