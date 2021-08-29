class Solution {
    public static String truncateSentence(String s, int k)
    {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        s = sb.toString();
        s = s.substring(0,s.length()-1); //removing the last added space
        return s;
    }
}



//Solution 2 - no additional space required
class Solution {
public static String truncateSentence(String s, int k)
    {
        int spaces = 0;
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)==' ')
                spaces++;
            if (spaces==k)
            {
                lastIndex = i;
                break;
            }
        }

		//based on the assumption that k is less or equals the number of words,
		//if we reached here and didn't update our last index, it means that we have exactly k words
		//the whole sentence should be copied.
        if (lastIndex==0)
            lastIndex = s.length();

        s = s.substring(0,lastIndex);
        return s;
    }
}