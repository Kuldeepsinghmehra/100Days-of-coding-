class bruteSubarray{
    public static int maxSubarray(int[] arr,int n)
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                maxi=Math.max(maxi, sum);
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;
        int maximum=maxSubarray(arr,n);
        System.out.println(maximum);

        
    }
}