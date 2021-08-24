import java.util.Arrays;

class Solution {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length - 1;
        return (nums[size] * nums[size - 1]) - (nums[0] * nums[1]);
    }
}



