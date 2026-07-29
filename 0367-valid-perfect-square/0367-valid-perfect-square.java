class Solution {
    public boolean isPerfectSquare(int num) {
        if ((num == 1) || (num == 0)) return true;
        long start=0;
        long end=num/2;
        
        while(start<=end)
        {
            long mid=(start+end)/2;
            long sqr=mid*mid;

            if(sqr==num)
            {
                return true;
            }
            else if(sqr<num)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return false;
    }
}