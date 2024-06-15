import java.util.Scanner;

public class arrayHashing {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] hash =new int[13];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;

        }
        int q;
        System.out.println("enter you query for hwo many numbers you want");
        q=sc.nextInt();
        while(q--!=0)
        {
            int number;
            System.out.println("enter number to search");
            number=sc.nextInt();
            System.out.println(hash[number]);

        }

        
    }
    
}
