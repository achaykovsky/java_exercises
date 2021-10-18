import java.util.Arrays;

public class Solution {
    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int result = words.length;
        boolean[] keyboard = new boolean[26];
        Arrays.fill(keyboard,true);
        for (int i = 0; i < brokenLetters.length(); i++) {
            keyboard[brokenLetters.charAt(i) - 'a'] = false;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (keyboard[words[i].charAt(j)-'a']==false) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}