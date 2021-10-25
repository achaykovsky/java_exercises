import java.util.Stack;

public class Solution {
    public static String makeGood(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.size() == 0)
                stack.push(s.charAt(i));

            //pops the lowercase letter and also since it is an 'else if' statement, it won't even push the uppercase letter!
			//by this we removed a pair of lowercase and uppercase letter.
            else if (Math.abs((int)(stack.peek()) - (int)(s.charAt(i))) == 32)
                stack.pop();
            
            else
                stack.push(s.charAt(i));
        }

        //going through the stack to get the whole string.
        while (stack.size() > 0) {
            result.append(stack.peek());
            stack.pop();
        }

        //the result reversed, so we need to reverse it
        result.reverse();
        return result.toString();
    }
}