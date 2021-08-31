import java.util.ArrayList;
import java.util.HashMap;

class Solution {
        public static int uniqueMorseRepresentations(String[] words)
        {
            int result = 0;
            String[] morceABC = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            ArrayList<String> cipheredWords = new ArrayList<String>();

			//converting all the words to morce code
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < words[i].length(); j++) {
                    char currentChar = words[i].charAt(j);
                    sb.append(morceABC[currentChar - 'a']);
                }
                cipheredWords.add(sb.toString());
            }

			//putting the ciphered words to a hashmap and counting how much of each word there is
            HashMap<String, Integer> hmap = new HashMap<String, Integer> ();
            for (int i = 0; i < cipheredWords.size(); i++)
            {
                int counter = 0;
                if (hmap.get(cipheredWords.get(i))==null) {
                    hmap.put(cipheredWords.get(i), counter);
                } else {
                    counter = hmap.get(cipheredWords.get(i));
                    hmap.put(cipheredWords.get(i), counter++);
                }
            }
			
			//counting the keys will give us the unique morce code
            result = hmap.size();

            return result;
        }

}



