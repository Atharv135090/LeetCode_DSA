class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high = Math.min(x / 2, 46340);

        if(x==1 || x==0)
        {
            return x;
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            long no=mid*mid;

            if(no==x)
            {
                return mid;

            }
            else if(no<=x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }return high;

    }
}