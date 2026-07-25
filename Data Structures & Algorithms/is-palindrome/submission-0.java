class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        //char[] arr = cleaned.toCharArray();

        int i=0;
        int j=cleaned.length()-1;
        while(i<=j)
        {
            if(cleaned.charAt(i) != cleaned.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        // String x = new String(arr);
        // if(x.equals(cleaned))
        // {
        //     return true;
        // }
        return true;
    }
}
