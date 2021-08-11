class Solution {
    public static int mySqrt(int x)
    {
        long square = 1;
        while(square * square <=x)
        {
            square++;
        }
        if (square * square >x)
            square--;
        return (int)square;
    }
}



