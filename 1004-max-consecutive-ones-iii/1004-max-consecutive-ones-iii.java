class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int countZero=0;
        int maxOnes=0;

        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                countZero++;
            }

            while(countZero>k)
            {
                if(nums[l]==0)
                {
                    countZero--;
                }
                l++;
            }
            int curr=r-l+1;
            maxOnes=Math.max(maxOnes,curr);
        }return maxOnes;
    }
}