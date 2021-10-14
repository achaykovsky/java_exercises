import java.util.HashMap;

public class Solution {
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
        }

        int value = 0, max = 0;
        for (int key : hashmap.keySet()) {
            value = hashmap.get(key);
            if (value == key)
                max = Math.max(max, value);
        }
        if (max > 0)
            return max;

        return -1;
    }
}