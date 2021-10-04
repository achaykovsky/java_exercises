import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    public static String[] findOcurrences(String text, String first, String second) {
        List<String> bigramWords = new ArrayList<String>();
        String[] words = text.split(" ");
        for (int i = 1; i < words.length; i++) {
            if ((words[i - 1].equals(first)) && (words[i].equals(second))) {
                if ((i + 1) < words.length)
                    bigramWords.add(words[i + 1]);
            }

        }

        String[] result = new String[bigramWords.size()];
        result = bigramWords.toArray(result);

        return result;
    }
}







