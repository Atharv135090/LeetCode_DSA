class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {   int max=0;
        int maxx=0;
        int n=weights.length;
        for(int data:weights)
        {
            max=Math.max(max,data);
        }
        for(int data:weights)
        {
            maxx+=data;
        }
        int low=max;
        int high=maxx;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int getDays=calculateDays(weights,mid );

            if(getDays>days)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }return low;
    }

    public int calculateDays(int[] weights,int capacity )
    {
        int currentWeight=0;
        int day=1;
        int n=weights.length;

        for(int i=0;i<n;i++)
        {
            if(currentWeight+weights[i]>capacity)
            {
                currentWeight=weights[i];
                day++;
            }
            else
            {
                currentWeight=currentWeight+weights[i];
            }
        }return day;
    }
}