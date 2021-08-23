class Solution {
    public static String sortSentence(String s)
    {
    StringBuilder sb = new StringBuilder("");
    String[] arrOfStr = s.split(" ");
    String[] strResult = new String[arrOfStr.length];
    String[] tokens;
        for (int i = 0; i < arrOfStr.length; i++)
        {
            tokens = arrOfStr[i].split("(?<=\\D)(?=\\d)");
            strResult[Integer.parseInt(tokens[1])-1] = tokens[0];
        }

        for(int i = 0; i < strResult.length; i++)
        {
            sb.append(strResult[i]);
            if (i!=strResult.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}



