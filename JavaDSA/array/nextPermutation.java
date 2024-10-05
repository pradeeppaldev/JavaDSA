package DSA.array;

import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
//        1.Using ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> ans = findNextPermutation(list);
        System.out.println(ans);

//        2.Using Array
        int[] nums = {1, 2, 3};
        findNextPermutation1(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static ArrayList<Integer> findNextPermutation(ArrayList<Integer> list) {
        int index = -1;

        // Step 1: Find the first decreasing element from the end (right to left).
        // This helps identify the point where we need to make the change to get the next permutation.
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                index = i;
                break;  // Stop once we find the first such index.
            }
        }

        // Step 2: If no such element is found, it means the list is in descending order,
        // so we simply reverse it to get the smallest possible order (i.e., ascending order).
        if (index == -1) {
            Collections.reverse(list);
        }

        // Step 3: Find the next larger element (rightmost) to swap with list[index].
        // This ensures we get the next lexicographically larger permutation.
        for (int i = list.size() - 1; i > index; i--) {
            if (list.get(i) > list.get(index)) {
                // Step 4: Swap the found element with list[index].
                int tmp = list.get(i);
                list.set(i, list.get(index));
                list.set(index, tmp);
                break;  // Swap done, break out of the loop.
            }
        }

        // Step 5: Reverse the part of the list after the swapped element (index+1 onward).
        // This ensures that we get the smallest possible arrangement after the swap,
        // completing the next permutation.
        return list;
    }


    public static void findNextPermutation1(int[] nums) {
        int index = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such element exists, reverse the whole array (smallest permutation)
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find the element just larger than nums[index] to swap
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the elements after index
        reverse(nums, index + 1, nums.length - 1);
    }

    // Helper method to swap elements in the array
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper method to reverse a subarray
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
