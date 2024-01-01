public class Solution {
    public static int minOperations(int[] nums) {
        int result = 0, operations = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                operations = nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i] + operations;
                result += operations;
            }
        }
        return result;
    }
}







