import java.util.HashMap;

public class DuplicateSubset {
     public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            freq.put(a1[i],freq.getOrDefault(a1[i],0)+1);
        }
        for(int i=0;i<m;i++)
        {
            if(!freq.containsKey(a2[i])|| freq.get(a2[i])==0)
            {
                return "No";
            }else{
                freq.put(a2[i],freq.get(a2[i])-1);
            }
        }
        return "Yes";
        
    }
    public static void main(String[] args) {
        String result;
        long[] a1={11,1,13,21,3,7};
        long[] a2={11,3,7,1};
        result=DuplicateSubset.isSubset(a1,a2,a1.length,a2.length);
        System.out.println(result);
        
        
    }
    
}
