class Solution {
    public static int findGCD(int[] nums)
    {
        int min = Integer.MAX_VALUE, max = 0;
        int divisor = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }

        for (int i = min; i > 0; i--)
        {
            if ((min % i == 0) && (max % i == 0))
            {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}



