import java.util.List;

class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> dividingNumbersList = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i))
                dividingNumbersList.add(i);
        }
        return dividingNumbersList;
    }

    public static boolean isDividingNumber(int num) {
        int digit = 0;
        int tempNum = num;
        while (tempNum > 0) {
            digit = tempNum % 10;
            if (digit == 0)
                return false;
            if (num % digit != 0)
                return false;
            tempNum /= 10;
        }
        return true;
    }
}


