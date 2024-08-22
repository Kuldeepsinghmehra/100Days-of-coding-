import java.util.Arrays;
import java.util.HashMap;

public class replaceCorrespondingRank{
     public static int[] ReturnArray(int[] arr)
    {
        int[] sortedArray=arr.clone();
        Arrays.sort(sortedArray);
        HashMap<Integer,Integer>rankMap=new HashMap<>();
        int rank=1;
        for(int num:sortedArray)
        {
            if(!rankMap.containsKey(num))
            {
                rankMap.put(num,rank);
                rank++;
                
            }
        }
        int[] outputArray=new int[sortedArray.length];
        for(int i=0;i<outputArray.length;i++)
        {
            outputArray[i]=rankMap.get(arr[i]);
        }
        return outputArray;
        
    }

    public static void main(String[] args) {
        int[] arr={100,2,70,2};
	    int[] result=replaceCorrespondingRank.ReturnArray(arr);
	    System.out.println(Arrays.toString(result));
    
    }

}
