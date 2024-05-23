public class palindroneString {
    public Boolean checkPalindrome(String str)
    {
        String rev="";
        Boolean ans=false;
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
            ans=true;
            
        }
        if(rev.equals(str))
        {
            ans= true;
        }
        else{
            ans=false;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        String inputValue="rahul";
        palindroneString ps=new palindroneString();
        Boolean value=ps.checkPalindrome(inputValue);
        if(value==true)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }       

    }
    
}
