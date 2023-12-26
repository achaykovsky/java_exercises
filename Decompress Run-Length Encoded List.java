import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static int[] decompressRLElist(int[] nums) {
        int freq;
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i+=2) {
            freq = nums[i];
            for (int j = 0; j < freq; j++) {
                values.add(nums[i+1]);
            }
        }

        int[] result = new int[values.size()];
        for (int i = 0; i < values.size(); i++)
            result[i] = values.get(i);

        return result;
    }
}



