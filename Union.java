import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void UnionArray(int[] arr,int[] arr2)
    {
        Set<Integer> sm=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            sm.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            sm.add(arr2[i]);
        }
        System.out.println("after printing"+" "+ sm);

    }
    public static void main(String[] args) {
        int[] arr={9,4,5,4,10};
        int[] arr2={1,2,3,4,5,6};
        Union.UnionArray(arr, arr2);
        
    }
    
}
