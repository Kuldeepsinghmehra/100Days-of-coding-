class lower{
    public static String lower(String s)
    {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]>='A'&& ch[i]<='Z')
            {
                ch[i]=(char)(ch[i+32]);
            }
        }
        return s;

    }
    public static void main(String[] args) {
        String arr="hJKLiot";
        System.out.print(lower(arr));
        
    }
}