package DSA.array;

import java.util.ArrayList;

public class unionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;       //Two pointers (i, j) are used to traverse both arrays simultaneously.

//        if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
//        list.isEmpty(): This checks if the list is empty. If the list is empty, it means no elements have been added yet,
//        so we can directly add arr1[i] to the list without worrying about duplicates.
//        list.get(list.size() - 1) != arr1[i]: This checks if the last element in the list is not equal to the current element arr1[i].
//        list.get(list.size() - 1) retrieves the last element in the list.

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {    //If arr1[i] is smaller, it's added to the result list and i is incremented
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {   //checks if the last element in the list (i.e., list.get(list.size() - 1)) is different from the current element (arr1[i]).
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {     //If arr2[j] is smaller, it's added to the list, and j is incremented.
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else {     //If both elements are equal, it's added once, and both i and j are incremented.
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
//        After one array is exhausted, the remaining elements from the other array are added (without duplicates).
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }
}
