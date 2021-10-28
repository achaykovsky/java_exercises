import java.util.Arrays;

class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] numbers = new int[101];
        int[] sum = new int[101];
        int[] result = new int[nums.length];

        //counting how much instances of each number there are
        for (int i = 0; i < nums.length; i++)
            numbers[nums[i]]++;


        //summing the number of the instances, therefore we get how much smaller number there are before the current
        sum[0] = numbers[0];
        for (int i = 1; i <= 100; i++)
            sum[i] = sum[i - 1] + numbers[i];


        //finding for each number in the given array, how much instances were samller than them (using the sum array)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = 1;
            else
                result[i] = sum[nums[i] - 1];
        }
        return result;
    }
}