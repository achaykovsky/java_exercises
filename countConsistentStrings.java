class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int[] alphabet = new int[26];
        int n = 0, counter = words.length;
        char curr, currLetter;
        for (int i=0;i<allowed.length();i++)
        {
            curr = allowed.charAt(i);
            alphabet[curr - 'a']++;
        }
        
        for(int j=0; j<words.length;j++)
        {
            n = words[j].length();
            for(int k=0; k<n;k++)
            {
                currLetter = words[j].charAt(k);
                if (alphabet[currLetter - 'a']==0)
                {
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }
}