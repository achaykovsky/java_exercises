class Solution {
    public static int firstUniqChar(String s) {
        int[] ABC = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ABC[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ABC[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}