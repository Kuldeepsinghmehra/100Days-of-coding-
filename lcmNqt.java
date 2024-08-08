public class lcmNqt{
    public static int GCD(int a,int b)
    {
        int result=0;
        int output;
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a=a%b;
            }else{
                b=b%a;
            }
        }
            if(a==0)
            {
                result=b;
            }else if(b==0)
            {
                result=a;
            }
            return result;

    }
    public static void main(String[] args) {
        int n1=20;
        int n2=25;
        int output=lcmNqt.GCD(n1, n2);

        System.out.println("lcm is "+(n1*n2)/output);
        
    }
}