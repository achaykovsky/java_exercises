import java.util.HashMap;

class Solution {
    public static int majorityElement(int[] nums) {
        if (nums.length==1)
            return nums[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int mapValue = 0, maxValue = 0,maxKey=0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else {
                mapValue = map.get(nums[i]);
                map.put(nums[i], ++mapValue);
                if (mapValue> maxValue) {
                    maxValue = mapValue;
                    maxKey = nums[i];
                }

            }
        }
        return maxKey;
    }
}