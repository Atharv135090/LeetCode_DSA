class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int n=nums.length;
        int max=0;
        for(int x:nums)
        {
            xor=xor^x;
            max=Math.max(max,x);
        }
        if(max==0) return 0;
        if(xor==0) return n-1;
        return n;
        
    }
}