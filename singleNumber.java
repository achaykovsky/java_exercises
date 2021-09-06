class Solution {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}



