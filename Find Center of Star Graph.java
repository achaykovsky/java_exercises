class Solution {
    public static int findCenter(int[][] edges)
    {
        int result = 0;
        HashMap<Integer, Integer> edgesCounter = new HashMap<Integer, Integer>();
        for (int i = 0; i < edges.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                Integer count = edgesCounter.get(edges[i][j]);
                if (count == null)
                    edgesCounter.put(edges[i][j], 1);
                else
                    edgesCounter.put(edges[i][j], count + 1);

                if (edgesCounter.get(edges[i][j]) == 2)
                {
                    result = edges[i][j];
                    break;
                }
            }
        }
        return result;
    }
}



