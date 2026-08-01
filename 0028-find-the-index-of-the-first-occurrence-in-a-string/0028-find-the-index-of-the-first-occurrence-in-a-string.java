class Solution {
    public int strStr(String haystack, String needle) {
        int k=needle.length();
        if(haystack.length()==1 && needle.length()==1)
        {
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            int j=0;
            while(j<k && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==needle.length())
            {
                return i;
            }
        }return -1;
    }
}