class Solution 
{
    public int reverse(int x) 
    {
        int digit = 0, reversed = 0;
        while(x!=0)
        {
			if ((reversed<=Integer.MIN_VALUE)||(reversed>=Integer.MAX_VALUE))
				return 0;
            digit = x%10;
            reversed = reversed*10 + digit;
            x = x/10;
        }
       return reversed;    
    }
}