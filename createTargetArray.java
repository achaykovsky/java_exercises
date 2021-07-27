class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        int[] target = new int [list.size()];
        for(int j=0; j<list.size();j++)
        {
            target[j] = list.get(j);
        }
        return target;
    }
}