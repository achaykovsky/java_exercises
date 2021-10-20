public class Solution {
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        int primaryDiagonal = 0, secondaryDiagonal = 0;

        for (int i = 0; i < mat.length; i++) {
            primaryDiagonal += mat[i][i];
        }


        int j = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            secondaryDiagonal += mat[i][j];
            j--;
        }

        result = primaryDiagonal + secondaryDiagonal;

        if (mat.length % 2 != 0)
            result -= mat[mat.length / 2][mat.length / 2];

        return result;
    }
}
