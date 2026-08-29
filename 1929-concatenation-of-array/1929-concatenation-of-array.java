class Solution {
    public int[] getConcatenation(int[] nums) {
        int o=nums.length;
        int n=o*2;
        int[] ans=new int[n];
        for(int i=0;i<=o-1;i++)
        {
            ans[i]=nums[i];
            ans[i+o]=nums[i];
        }return ans;
    }
}