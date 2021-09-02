
class Solution {
	
    public static String interpret(String command) {
		
        StringBuilder sb = new StringBuilder("");
		
        for (int i = 0; i < command.length(); i++) 
		{
            if (command.charAt(i)=='G')
                sb.append('G');
            else if ((command.charAt(i)=='(') &&(command.charAt(i+1)==')'))
                sb.append('o');
            else if ((command.charAt(i)=='(') &&(command.charAt(i+1)=='a'))
                sb.append("al");
        }
		
        String result = sb.toString();
		
        return result;
    }
}



