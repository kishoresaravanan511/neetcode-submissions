class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> ans = new HashSet<>();
        int st = 0;
        int max = 0;
        
        for(int end = 0;end<n;end++)
        {
            while(ans.contains(s.charAt(end)))
            {
                ans.remove(s.charAt(st));
                st++;
            }
            ans.add(s.charAt(end));
            max = Math.max(end-st+1,max);   
        }
        return max;
    }
}
