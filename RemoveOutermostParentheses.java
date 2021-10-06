public class Solution {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                counter++;
                if (counter > 1)
                    sb.append('(');

            }

            if (s.charAt(i) == ')') {
                if (counter > 1)
                    sb.append(')');
                counter--;
            }

        }

        return sb.toString();
    }
}
