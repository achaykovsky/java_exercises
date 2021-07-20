
//This solution is based on the idea that the maximal number will be when we replace the first 6 that we'll meet in our number (from left to right).
class Solution {
    public int maximum69Number (int num) 
    {
        int digit = 0, numOfdigits = 0;
        List<Integer> digits= new ArrayList<Integer>();
        int newNum = 0;
        while(num!=0)//finding out all the digits
        {
                digit = num%10;
                num/=10;
                digits.add(digit);
        }
        for(int i=digits.size() - 1; i>=0; i--)//replacing the first six we find
        {
           if (digits.get(i)==6)
           {
               digits.set(i,9);
               break;
           }
        }
        for(int j=digits.size() - 1; j>=0; j--)//reconstructing the whole new number
        {
            newNum = newNum*10 + digits.get(j);
        }
        return newNum;
    }
}