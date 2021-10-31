public class Solution {
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        boolean even = false;
        if (n % 2 == 0)
            even = true;

        if (even) {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        } else
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        return sb.toString();
    }
}
