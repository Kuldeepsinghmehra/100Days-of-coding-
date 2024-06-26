public class secondLargest {
    public static void BetterOpprach(int[] arr,int N)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            smallest=Math.min(smallest,arr[i] );
            largest=Math.max(largest,arr[i]);

        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]<secondSmallest && arr[i]!=smallest)
            {
                secondSmallest=arr[i];
            }
            if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println("largest "+largest);
        System.out.println("smallest "+smallest);
        System.out.println("second largest "+secondLargest);
        System.out.println("second smallest "+secondSmallest);

    }
    public static void main(String[] args) {
        int[] arr={2,5,3,7,9,1};
    secondLargest.BetterOpprach(arr, arr.length);

        
    }
    
}
