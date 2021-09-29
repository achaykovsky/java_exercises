public class Solution {
    public static int getLucky(String s, int k) {
        int result = 0;
        int digit = 0, alphabeticalOrder = 0;
        int sum = 0, sumOfDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            alphabeticalOrder = s.charAt(i) - 'a' + 1;
            if (alphabeticalOrder >= 10) {
                digit = alphabeticalOrder % 10;
                sumOfDigits = digit + alphabeticalOrder / 10;
            } else sumOfDigits = alphabeticalOrder;
            sum += sumOfDigits;
        }

        // if k=1 there is no need to make the transform again, since we already found the sum.
        if (k == 1)
            return sum;

        //k>1 means we need to make the transform procedure a few more times
        while (k > 1) {
            result = 0;
            while (sum > 0) {
                digit = sum % 10;
                result += digit;
                sum /= 10;
            }
            sum = result;
            if (sum < 10)
                return result;
            k--;
        }
        return result;
    }
}