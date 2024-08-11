import java.util.Arrays;

public class largestOdd {
    public static void returnLargestodd(char[] value)
    {
        int N=value.length;
        Arrays.sort(value);
        for(int i=N-1;i>=0;i--)
        {
            if(value[i]%2!=0)
            {
                System.out.println("largest odd"+" "+value[i]);
                return;
            }    
        }
        System.out.println("");
      
       
    }
    public static void main(String[] args) {
        String num="32348";
        char[] result;
        result=num.toCharArray();
        largestOdd.returnLargestodd(result); 
    }
    
}
