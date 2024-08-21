public class leftrotateDplaces {
    public static void LeftreturnArray(int[] arr,int N,int D)
    {
        int[] temp=new int[N];
        for(int i=0;i<D;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=0;i<N-D;i++)
        {
            arr[i]=arr[i+D];
        }
        for(int i=N-D;i<N;i++)
        {
            arr[i]=temp[i-N+D];
        }
          
    }
    public static void RightreturnArray(int[] arr,int N,int D)
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
        leftrotateDplaces.RightreturnArray(arr, length,k);
        System.out.println("after rotating right");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     
        System.out.println("After left rotating");
        leftrotateDplaces.LeftreturnArray(arr, length, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
}
