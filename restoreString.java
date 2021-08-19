class Solution {

    public static String restoreString(String s, int[] indices) {
        String result = "";
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            shuffled[indices[i]] = s.charAt(i);

        result = String.valueOf(shuffled);
        return result;
    }
}



