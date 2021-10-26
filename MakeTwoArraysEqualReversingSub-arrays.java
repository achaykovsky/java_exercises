import java.util.Arrays;

//trivial solution using sorting and compare them.
public class Solution {
    //Make Two Arrays Equal by Reversing Sub-arrays
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i])
                return false;
        }
        return true;
    }
}

//since we the constraint on the values of the numbers, we also can make a bucket sort solution,
//and then, there is no need for sorting both of them... then the complexity will be O(n) and not O(nlogn)