import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i < n+1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                result.add("Fizz");
                continue;
            } else if (i % 5 == 0) {
                result.add("Buzz");
                continue;
            }
            result.add(String.valueOf(i));
        }
        return result;
    }
}
