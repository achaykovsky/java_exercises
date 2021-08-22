import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums)
    {
        int[] result = new int[2 * nums.length];
        for (int j = 0; j < nums.length; j++)
        {
            result[j] = nums[j];
            result[j + nums.length] = nums[j];
        }
        return result;
    }
}



