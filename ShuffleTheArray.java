class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0, i = 0;
        while (i < n)
        {
            result[j] = nums[i];
            result[++j] = nums[i + n];
            j++;
            i++;
        }
        return result;
    }
}



