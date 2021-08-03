class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int sum = 0;
        int[] uniqueness = new int[101];
        for(int i=0; i<nums.length; i++)
        {
            uniqueness[nums[i]]++;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if (uniqueness[nums[i]]==1)
                sum+=nums[i];
        }
        return sum; 
    }
}
