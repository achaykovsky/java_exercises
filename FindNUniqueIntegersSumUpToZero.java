import java.util.Arrays;

public class Solution {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        boolean even = false;
        int num = 1, size = 0;
        if (n % 2 == 0) {
            even = true;
            size = n;
        } else
            size = n - 1;


        for (int i = 0; i < size; i+=2) {
            result[i] = num;
            result[i + 1] = -num;
            num++;
        }
        if (!even)
            result[n - 1] = 0;

        return result;
    }
}
