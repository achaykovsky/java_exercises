class Solution {
    public int repeatedNTimes(int[] A) 
    {
        int num = 0;
        int[] unique = new int [10000];
        for(int a : A)
        {
            unique[a]++;
            if (unique[a]>1)
            {
                num = a;
                break;
            }
        }
        return num;   
    }
}



//check it out!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Set<Integer> set = new HashSet<>();

    for(int i = 0; i<A.length; i++)
    {     
        if(set.contains(A[i]))
        {
            return A[i];
        }
         set.add(A[i]);     
    }
    return 0;
	
	
	
//check it out!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! O(n) Time and O(1) space	
	class Solution {
    public int repeatedNTimes(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            int k = (j + 1) % n;
            if (A[i] == A[j] || A[i] == A[k]) return A[i];
            if (A[j] == A[k]) return A[j];
        }
        return 0;
    }
}