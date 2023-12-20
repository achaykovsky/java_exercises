public class Solution {
    public static String freqAlphabets(String s) {
        StringBuilder token = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Integer number = 0;
        char numberToChar;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                token.append(s.charAt(i - 2));
                token.append(s.charAt(i - 1));
                number = Integer.valueOf(token.toString());
                i-=2;
                token.setLength(0);
            } else {
                number = s.charAt(i) - '0';
            }
            numberToChar = (char)(number - 1 + 'a');
            result.append(numberToChar);
        }
        result.reverse();
        return result.toString();
    }
}







