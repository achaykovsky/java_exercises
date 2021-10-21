import java.util.Arrays;

//trivial solution using two nested loops
class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            swap(image[i]);
            flip(image[i]);
        }
        return image;
    }

    public static void swap(int[] row) {
        int start = 0, end = row.length - 1;
        int temp = 0;
        for (int j = 0; j < row.length / 2; j++) {
            temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    public static void flip(int[] row) {
        for (int j = 0; j < row.length; j++) {
            if (row[j] == 0)
                row[j] = 1;
            else if (row[j] == 1)
                row[j] = 0;
        }
    }
}
