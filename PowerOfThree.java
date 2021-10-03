class Solution {
    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;

        if ((n % 3 != 0) || (n == 0))
            return false;

        int result = 1;
        while (result < n)
            result *= 3;

        if (result == n)
            return true;
        return false;
    }
}


