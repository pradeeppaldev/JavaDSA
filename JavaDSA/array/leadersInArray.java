package DSA.array;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Brute Force Approach : " + leader1(arr));   //Brute Force Approach
        System.out.println("Optimal Approach : " + leader2(arr));   //Optimal Approach
    }

    public static ArrayList<Integer> leader1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    k++;
                }
            }
            if (k == 0) {
                list.add(arr[i]);
            }
            k = 0;
        }
        return list;
    }

    static ArrayList<Integer> leader2(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                list.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}
