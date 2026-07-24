class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        
        for(int i=0;i<str.length;i++)
        {
            char[] str1=str[i].toCharArray();
            int min=0;
            int max=str1.length-1;
            while(min<=max)
            {
                char temp=str1[min];
                str1[min]=str1[max];
                str1[max]=temp;
                min++;
                max--;
            } 
            str[i]=new String(str1);
        }return String.join(" ",str);
    }
}