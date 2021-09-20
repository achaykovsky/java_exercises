class Solution {
    public static char[] reverseString(char[] s) {
        int end = s.length - 1;
        char temp;
        for (int start = 0; start < s.length/2; start++) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
        }
        return s;
    }
}



