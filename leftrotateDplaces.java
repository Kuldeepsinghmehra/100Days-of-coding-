public class leftrotateDplaces {
    public static void returnArray(int[] arr,int N,int D)
    {
        int[] temp=new int[N];
        for(int i=N-D;i<N;i++)
        {
            temp[i-N+D]=arr[i];

        }
        for(int i=N-D-1;i>=0;i--)
        {
            arr[i+D]=arr[i];
        }
        for(int i=0;i<D;i++)
        {
            arr[i]=temp[i];
        }
       

    }
 
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        int length=arr.length;
        leftrotateDplaces.returnArray(arr, length,k);
        System.out.println("after rotating right");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
