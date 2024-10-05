package DSA.array;

import java.util.ArrayList;

public class intersectionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4};
        System.out.println(intersection(arr1, arr2, arr1.length, arr2.length));
    }

    static ArrayList<Integer> intersection(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 0 || m == 0) {
            return list;
        }
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (arr1[i] == arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {      //to remove/reject adjacent duplicate elements
                    list.add(arr1[i]);
                }
                j++;
            }
        }
        return list;
    }
}
