//Count Number of Pairs With Absolute Difference K

    public static int countKDifference(int[] nums, int k) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            //making a counting hashmap
            map.put(num, map.getOrDefault(num, 0) + 1);

            //looking for values that are equal to num-k and summing them to the counter
            if (map.containsKey(num - k))
                counter += map.get(num - k);

            //looking for values that are equal to num-k and summing them to the counter
            if (map.containsKey(num + k))
                counter += map.get(num + k);
        }
        return counter;
    }


//trivial solution using brute force
public class Solution {

    public static int countKDifference(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((Math.abs(nums[j]-nums[i]) ==k) && (i<j))
                    counter++;
            }
        }
        return counter;
    }

}







