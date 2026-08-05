class Solution {
    public int removeDuplicates(int[] nums) {
        int change=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[change-1])
            {
                int temp=nums[i];
                nums[i]=nums[change];
                nums[change]=temp;
                change++;
            }
        }return change;
    }
}