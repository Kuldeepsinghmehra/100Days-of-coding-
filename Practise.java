import java.util.*;
public class Practise {
    public void checkFrequency(int [] arr,int N)
    {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],1);
            }else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int maxF=0,minF=N;
        int maxEle=0,minEle=0;   
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
           int count=entry.getValue();        
           int elements=entry.getKey();
           if(count>maxF)
           {
            maxEle=elements;
            maxF=count;
           }
           if(count<minF)
           {
            minEle=elements;
            minF=count;
            
           }

        }
        System.out.println("the maximum frequency elemnts is"+"=>"+maxEle);
        System.out.println("the minimum frequency elemnts is"+"=>"+minEle);


      
        


    }
    public static void main(String[] args) {
        Practise p=new Practise();
        int[] arr={10,5,10,15,10,5};
        int length=arr.length;
        p.checkFrequency(arr,length);
   
    }
  

    
}