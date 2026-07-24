class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        boolean hasDup = false;
        for(int x:nums)
        {
            if(!s.add(x))
            {
                return true;
            }
            else
            {
                hasDup = false;
            }
        }
        // if(hasDup)
        //     return true;
        return false;
    }
}