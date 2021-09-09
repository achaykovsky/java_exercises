import java.util.HashMap;

class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] sABC = findNumOfLetters(s);
        int[] tABC = findNumOfLetters(t);

        for (int i = 0; i < 26; i++) {
            if (sABC[i] != tABC[i])
                return false;
        }
        return true;
    }

    public static int[] findNumOfLetters(String s) {
        int[] ABC = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ABC[s.charAt(i) - 'a']++;
        }
        return ABC;
    }
}
