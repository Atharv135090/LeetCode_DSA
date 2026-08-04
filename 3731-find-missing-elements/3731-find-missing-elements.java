class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num:nums)
        {
            max=Math.max(max,num);
            min=Math.min(min,num);
        }

        Set<Integer> set=new HashSet<>();
        for(int num1:nums)
        {
            set.add(num1);
        }

        List<Integer> miss=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(i))
            {
                miss.add(i);
            }
        }return miss;
        
    }
}