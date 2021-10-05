import java.util.List;

public class Solution {
    public static int sumBase(int n, int k) {
        int result = 0;
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n % k);
            n /= k;
        }

        for (int i = 0; i < digits.size(); i++) {
            result += digits.get(i);

        }
        return result;
    }
}
