class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count=new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            count[t.charAt(i)]--;
        }
        for(int c:count)
        {
            if(c!=0) return false;
        }return true;
    }
}