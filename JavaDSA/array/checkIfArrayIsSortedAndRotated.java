package DSA.array;

public class checkIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int p = 0;      //keeps track of how many "out-of-order" points exist, i.e., where an element is larger than the next element.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {        //checks if the current element is greater than the next one.
                p++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {      //checks the last element of the array (nums[nums.length - 1]) to see if it's greater than the first element (nums[0])
            p++;
        }
        if (p <= 1) {       //if p = 0/1 return true. If there are no more than one out-of-order point (p <= 1), it means the array is either:
            return true;    //Sorted but not rotated (if p = 0)
        }                   //Rotated once but still sorted (if p = 1)
        return false;
    }
}
