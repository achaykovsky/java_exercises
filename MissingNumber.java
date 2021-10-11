import java.util.Arrays;

//mathematical soultion: based on the arithemetic series sum
class Solution {
    public static int missingNumber(int[] nums) {
        //calculating the current sum
        int sum = Arrays.stream(nums).sum();

        int n = nums.length;
        //calculating the sum of arithmetic series (expected value)
        int targetedSum = ((1+n) * n)/2;

        //the difference will be the missing number
        return targetedSum - sum;
    }
}


//solution using a data structure
class Solution {
    public static int missingNumber(int[] nums) {
        boolean[] numExist = new boolean[nums.length+1];
        Arrays.fill(numExist, false);
        int result  = 0;
		
		//every existing number is true
        for (int i = 0; i < nums.length; i++) {
            numExist[nums[i]] = true;
        }

		//finding the only number that doesn't exist
        for (int i = 0; i < numExist.length; i++) {
            if (numExist[i]==false) {
                result = i;
                break;
            }
        }

        return result;
    }
}