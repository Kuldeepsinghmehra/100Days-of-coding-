import java.util.HashMap;
import java.util.Map;

public class FrequencyHashmap {
    public static void main(String[] args) {
        int[] arr={10,10,20,30,50,60,50};
        Map<Integer, Integer> mp=new HashMap<>();
        System.out.println("The frequency of there elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer>entry:mp.entrySet()) {
            System.out.println(entry.getKey()+"--> "+entry.getValue());
            
        }
    }
   
    
}
