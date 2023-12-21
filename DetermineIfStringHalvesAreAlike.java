class Solution {
    public static boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        s = s.toLowerCase();
        int vowels = 0;
        for (int i = 0; i < half; i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e') || (s.charAt(i) == 'u'))
                vowels++;
        }
        for (int i = half; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e') || (s.charAt(i) == 'u'))
                vowels--;
        }
		
		//if vowels are 0 increasing and decreasing the counter, they are equal in both halves.
        if (vowels == 0)
            return true;
        return false;
    }
}