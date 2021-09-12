class Solution {
    public static boolean checkIfPangram(String sentence) {
        boolean[] abc = new boolean[26];
        Arrays.fill(abc, false);
        for (int i = 0; i < sentence.length(); i++) {
            abc[sentence.charAt(i)-'a'] = true;
        }

        for (int i = 0; i < abc.length; i++) {
            if (abc[i]==false)
                return false;
        }
        return true;
    }
}



