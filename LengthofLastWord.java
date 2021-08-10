import java.util.Arrays;

class Solution {
    public static int lengthOfLastWord(String s) 
	{
        String[] arrOfStr = s.split(" ");
        int lengthLastString = arrOfStr[arrOfStr.length-1].length();
        return lengthLastString;
    }
}



