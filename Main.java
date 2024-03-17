import java.util.*;
public class Main {
	public  void printNumber(int n)
	{
		int Even=0;
		int odd=0;
		int original=n;
		while(original>0)
		{
            int rem=original%10;
            if(rem%2==0)
            {
                Even+=rem;
            }
            else{
                odd+=rem;
            }
            original=original/10;
		}
        System.out.println(Even+" "+odd);

	}
	
	public static void main(String[] args) {
		// Write your code here
		int input;
		Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
		Main m=new Main();
        m.printNumber(input);
        

		

	}
}
