import java.util.Arrays;

//linear solution by finding the max and the second max in the array
public class Solution {
    public static int maxProduct(int[] nums) {
        int max = 0, secondMax = 0, indexMax = 0;
		int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                indexMax = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (secondMax < nums[i] && indexMax != i)
                secondMax = nums[i];
        }
		
		result = (max - 1) * (secondMax - 1);
			
        return result;
    }
}

//solution using sorting
public class Solution {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int result = (nums[n] - 1) * (nums[n-1] - 1);
        return result;
    }
}







