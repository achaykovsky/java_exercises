class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isAlphabetical(s.charAt(i)) || isNumeric(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        String cleanedStr = sb.toString();
        int j = cleanedStr.length() - 1;
        for (int i = 0; i < cleanedStr.length(); i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(j))
                return false;
            j--;
        }
        return true;
    }

    public static boolean isAlphabetical(char c) {
        if ((c >= 'a') && (c <= 'z'))
            return true;
        return false;
    }

    public static boolean isNumeric(char c) {
        if ((c >= '0') && (c <= '9'))
            return true;
        return false;
    }
}


