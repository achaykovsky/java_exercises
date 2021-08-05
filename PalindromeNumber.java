class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        String number = String.valueOf(x);
        int end = number.length() - 1 ;
        for (int start=0; start<end; start++)
        {
            if (number.charAt(start)==number.charAt(end))
            {
                end--;
                continue;
            }
            else
                return false;
        }
        return true;
    }
}



