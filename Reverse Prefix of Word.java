class Solution {
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                index = i;
                break;
            }
        }

        for (int i = index; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        for (int i = index + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}

