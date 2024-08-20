import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arraySortedtoOrder {
     public static void ReturnFunction(int[] arr1,int[] arr2)
    {
         HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int num:arr1)
        {
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
            
        }
        List<Integer> result=new ArrayList<>();
        for(int num:arr2)
        {
            if(freqMap.containsKey(num))
            {
                int count=freqMap.get(num);
                for(int i=0;i<count;i++)
                {
                    result.add(num);
                }
                freqMap.remove(num);
                
            }
            
        }
        List<Integer> remaining=new ArrayList<>();
        for(Map.Entry<Integer,Integer> me:freqMap.entrySet())
        {
            int count=me.getValue();
            for(int i=0;i<count;i++)
            {
                remaining.add(me.getKey());
            }
        }
        Collections.sort(remaining);
        result.addAll(remaining);
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=result.get(i);
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={4, 5, 1, 1, 3, 2};
        int[] arr2={3, 1};
        arraySortedtoOrder.ReturnFunction(arr1,arr2);
    }
    
}
