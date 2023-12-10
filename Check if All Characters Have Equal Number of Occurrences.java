//Check if All Characters Have Equal Number of Occurrences

class Solution {
    public static boolean areOccurrencesEqual(String s) {
        int[] ABC = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ABC[s.charAt(i) - 'a']++;
        }
        int occurence = ABC[s.charAt(0)-'a'];

        for (int i = 0; i < 26; i++) {
            if((ABC[i]==occurence) || (ABC[i]==0))
                continue;
            if((ABC[i]!=occurence))
                return false;
        }
        return true;
    }
}


