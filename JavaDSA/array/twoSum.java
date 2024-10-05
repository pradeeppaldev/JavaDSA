package DSA.array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum{
    public static void main(String[] args) {
        int[] arr = {7,11,2,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumProblem(arr , target)));
    }
    public static int[] twoSumProblem(int[] arr , int target){
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int moreNeeded = target - arr[i];
            if (map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);   //map.get(moreNeeded) retrieves the index (value) associated with the number moreNeeded (key) that was previously stored in the HashMap.
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);  //line map.put(arr[i], i) is adding a key-value pair to the HashMap called map.
        }
        return ans;
    }
}
//Why put the map.put(arr[i], i) after the if statement?
//This ensures that you're not trying to match the current element with itself.
//The current number arr[i] will be stored in the map for future iterations, in case any future number in the array needs it as a complement.
