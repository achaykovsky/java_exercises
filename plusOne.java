class Solution
{
    public int[] plusOne(int[] digits)
    {
        for (int i = digits.length-1; i >=0; i--)
        {
            if ((digits[i]==9) && (i==0))
            {
                digits[i] = 0;
                int[] result = new int[digits.length+1];
                System.arraycopy(digits, 0, result, 1, digits.length);
                result[0] = 1;
                return result;
            }
            if (digits[i]==9)
            {
                digits[i] = 0;
                if (digits[i-1]!=9)
                    digits[i - 1]++;
                else
                    continue;
            }
            else
                digits[i]++;
            return digits;
        }
        return digits;
    }
}

