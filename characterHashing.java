import java.util.Scanner;

public class characterHashing {
    public static void main(String[] args) {
        System.out.println("enter you sentence");
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
        }
        System.out.println("enter you query number");
        int q=sc.nextInt();
        while(q-->0)
        {
            char c;
            c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
    
}
