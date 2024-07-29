public class LongestSubarray {
    public static int returnSubarray(int[]arr,int N,int s)
    {
        int length=0;
        for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=i;j<N;j++)
            {
                sum+=arr[j];
                if(sum==s)
                {
                    length=Math.max(length, j-i+1);
                }
            }
                    
         }  
         return length;  

        }
    
    public static void main(String[] args) {
        int[] arr={2,3,5,1,9};
        int N=arr.length;
        int k=6;
       int result= LongestSubarray.returnSubarray(arr, N, k);
       System.out.println(result);

    }
}
    

