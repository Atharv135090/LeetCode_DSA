class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char[] str=s.toCharArray();

        int n=str.length;
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(str[i]))
            {
                map.put(str[i], map.get(str[i]) + 1);
            }else{
                map.put(str[i],map.getOrDefault(str[i], 0) + 1);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(map.get(str[i])==1)
            {
                return i;
            }
        }return -1;


    }
}