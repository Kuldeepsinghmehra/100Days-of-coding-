public class Bubblesort {
    public static int[] Sort(int[] arr,int N)
    {
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        
        int[] arr={10,4,5,7,9,8};
        int[] sorted=Bubblesort.Sort(arr, arr.length);
        System.out.println("Array after sorting ");
        for (int i : sorted) {
            System.out.print(i+" ");
            
        }

    }
    
}
