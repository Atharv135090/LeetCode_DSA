class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i]<=nums[i-1])
        {
            i--;
        }
        int pivot=i-1;

        if(pivot==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }

        int j=nums.length-1;
        while(j>0 && nums[j]<=nums[pivot])
        {
            j--;
        }
        int temp1=nums[j];
        nums[j]=nums[pivot];
        nums[pivot]=temp1;


        reverse(nums,pivot+1,nums.length-1);
        return;
    }    
    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    
}