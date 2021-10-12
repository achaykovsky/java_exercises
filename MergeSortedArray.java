public class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0)
            return nums1;
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else if (nums1[m-1] < nums2[n - 1]) {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        while (n > 0) {
            nums1[last] = nums2[n - 1];
            last--;
            n--;
        }
        return nums1;
    }
}