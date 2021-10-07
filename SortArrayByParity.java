import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//solution based on two pointers
class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenPtr = 0, oddPtr = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenPtr] = nums[i];
                evenPtr++;
            }

            if (nums[i] % 2 != 0) {
                result[oddPtr] = nums[i];
                oddPtr--;
            }
        }
        return result;
    }
}

//trivial solution with allocating additinal memory
public class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        List<Integer> oddNumbers = new ArrayList<Integer>();
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                oddNumbers.add(nums[i]);

            if (nums[i] % 2 == 0)
                evenNumbers.add(nums[i]);
        }

        evenNumbers.addAll(oddNumbers);
        for (int i = 0; i < evenNumbers.size(); i++)
            result[i] = evenNumbers.get(i);
        return result;
    }

}







