class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        int[] freq = new int[26];

        for(char x : s.toCharArray())
        {
            freq[x-'a']++;
        }
        for(char y : t.toCharArray())
        {
            freq[y-'a']--;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] != 0)  return false;
        }
        return true;
    }
}
