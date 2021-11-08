//better performance by skipping some of the iterations
public class Solution {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((Math.abs(arr[i] - arr[j]) > a))
                    continue;
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c) && j < k) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

// trivial solution - brute force
public class Solution {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a) && i < j && (Math.abs(arr[j] - arr[k]) <= b) && j < k && (Math.abs(arr[i] - arr[k]) <= c)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
