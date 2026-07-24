class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(i,nums[i]);
        }

        
        for(int j=0;j<m.size();j++)
        {
            for(int k=j+1;k<m.size();k++)
            {
            if(m.get(j) + m.get(k) == target)
            {
                return new int[]{j,k};
            }
            }
        }
        return new int[]{};
    }
}
