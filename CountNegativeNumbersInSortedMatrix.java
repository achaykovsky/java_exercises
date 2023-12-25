//Count Negative Numbers in a Sorted Matrix

public class Solution {
    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
				//the rows are sorted in decreasing order, 
				//so count them from the ending or break when arriving to 0 or larger.
                if (grid[i][j] < 0)
                    result++;
                else
                    break;
            }
        }
        return result;
    }
}







