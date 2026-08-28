class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='6')
            {
                ch[i]='9';
                break;
            }
        }
        String as=new String(ch);
        int k=Integer.parseInt(as);
        return k;
    }
}