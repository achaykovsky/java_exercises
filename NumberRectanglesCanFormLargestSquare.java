import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int countGoodRectangles(int[][] rectangles) {
        int result = 0;
        List<Integer> maxLen = new ArrayList<>();
        for (int i = 0; i < rectangles.length; i++) {
                maxLen.add(Math.min(rectangles[i][0], rectangles[i][1]));
        }
        int max = Collections.max(maxLen);
        result = Collections.frequency(maxLen, max);

        return result;
    }
}