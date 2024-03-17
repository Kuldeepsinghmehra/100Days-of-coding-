import java.util.Scanner;


public class RecursionFibonacci {
    static int n1=0;
    static int n2=1;
    static int n3;
    public  void printFibonacci(int n)
    {  
        if (n>0) {
            int n3=n1+n2;
            n1 = n2;    
            n2 = n3; 
            System.out.print(n3+" ");
            printFibonacci(n-1);
            
        }
       

        
    }
    public static void main(String[] args) {
        int input;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        RecursionFibonacci rf=new RecursionFibonacci();
        rf.printFibonacci(input-2);

        
    }
    
}
