import java.util.*;
public class Main {
	public static void main(String[] args) {
		
      
	  int num=1634;
	  int original=num;
	  int rev=0;
	  int sum=0;
	  while(num>0)
	  {
		int rem=num%10;
		sum+=rem*rem*rem;
		num/=10;
		
	  }
	  if(original==sum)
	  {
		System.out.println("armstrong");
	  }
	  else{
		System.out.println("not armstrong");
	  }


	
	}
}
