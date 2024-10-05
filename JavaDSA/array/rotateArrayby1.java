package DSA.array;

import java.util.Arrays;

public class rotateArrayby1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Array before Rotation : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Left Rotate Array by 1 Place : ");
        System.out.println(Arrays.toString(rotateBy1(arr)));
    }

    private static int[] rotateBy1(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
