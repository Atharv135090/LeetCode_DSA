class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        
        int left=0;
        int n=s.length();
        int maxx=0;

        for(int right=0;right<n;right++)
        {   char ch=s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxx=Math.max(maxx,right-left+1);

        }return maxx;
    }
}