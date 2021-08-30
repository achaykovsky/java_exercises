class Solution {
     public static String replaceDigits(String s) {
        int steps, stringLength = s.length();
        char shiftedElement;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < stringLength; i += 2) {
            steps = s.charAt(i) - '0';
            shiftedElement = (char) (s.charAt(i - 1) + steps);
            sb.append(s.charAt(i - 1));
            sb.append(shiftedElement);
        }

        //if the string length is odd, the last char didn't have a pair number to shift,
        // and we just need to add it as is
        if (stringLength % 2 != 0)
            sb.append(s.charAt(stringLength - 1));

        return sb.toString();
    }
}



