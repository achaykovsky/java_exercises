import java.util.Arrays;

class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        final int ABC_SIZE = 26;
        int[] numsOfStones = new int[2 * ABC_SIZE];
        int[] sumOfJewels = new int[jewels.length()];
        int sum = 0;
        char currentChar;
		
		//counting the how many stones there are
        for (int i = 0; i < stones.length(); i++)
        {
            currentChar = stones.charAt(i);
            if (Character.isLowerCase(currentChar))
                numsOfStones[currentChar - 'a']++;
            else
                numsOfStones[currentChar - 'A' + ABC_SIZE]++;
        }
		
		//counting how many jewels of each type there are based on the stones.
        for (int i = 0; i < jewels.length(); i++)
        {
            currentChar = jewels.charAt(i);
            if (Character.isLowerCase(currentChar))
            {
                if (numsOfStones[currentChar - 'a'] > 0)
                    sumOfJewels[i] = numsOfStones[currentChar - 'a'];
            } else {
                if (numsOfStones[currentChar - 'A' + ABC_SIZE] > 0)
                    sumOfJewels[i] = numsOfStones[currentChar - 'A' + ABC_SIZE];
            }
        }
		//summing the jewels
        sum = Arrays.stream(sumOfJewels).sum();
        return sum;
    }
}



