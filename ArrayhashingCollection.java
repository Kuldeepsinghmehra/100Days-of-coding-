import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayhashingCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number you want to enter");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter your numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer , Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key =arr[i];
            int freq=0;
            if(mp.containsKey(key)) freq= mp.get(key);
            freq++;
            mp.put(key, freq);
        }  
        System.out.println("resulted ouccerence is ");
        for(Map.Entry<Integer,Integer> it:mp.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }
       
    }

    
}
