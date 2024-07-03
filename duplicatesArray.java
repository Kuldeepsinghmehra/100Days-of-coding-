import java.util.HashSet;

public class duplicatesArray {
    // Brute force approach

    // public static void returnArray(int[] arr,int N)
    // {
    //     HashSet<Integer> hs=new HashSet<>();
    //     for(int i=0;i<N;i++)
    //     {
    //         hs.add(arr[i]);
    //     }
    //     for (Integer x : hs) {
    //         System.out.print(x+" ");
            
    //     }
        
    // }

   // OPTIMAL APPROACH
    public static void returnArray(int[] arr,int N)
    {
        int i=0;
        for(int j=1;j<N;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
      
             
        }
        for(int k=0;k<=i;k++)
        {
            System.out.print(arr[k]+" ");
        }
           
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4};
        duplicatesArray.returnArray(arr, arr.length);
    }
}