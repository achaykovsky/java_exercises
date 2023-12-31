//Find Numbers with Even Number of Digits
class Solution {
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}

