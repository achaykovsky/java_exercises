class Solution {
    public static int maxDepth(String s) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                counter++;
            else if (s.charAt(i) == ')')
                counter--;

            if (max < counter)
                max = counter;
        }
        return max;
    }
}



