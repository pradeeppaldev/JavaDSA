package DSA.array;

class missingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 0 to n
        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }

        return expectedSum - actualSum;  // The missing number
    }
}
