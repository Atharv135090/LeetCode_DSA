class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int max=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {

            if(e.getValue()==max)
            {

                return e.getKey();
                
            }

        }return -1;
    }
}