//Number of 1 Bits

class Solution {
    public static int hammingWeight(int n) {
        String binaryRepresantation = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < binaryRepresantation.length(); i++) {
            if (binaryRepresantation.charAt(i)=='1')
                count++;
        }
        return count;
    }
}


