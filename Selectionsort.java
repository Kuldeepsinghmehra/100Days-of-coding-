public class Selectionsort {
    public static int[] sort(int[] arr,int N)
    {
        for(int i=0;i<N;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<N;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
                

            }
            int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
        }

        return arr;

    }
    public static void main(String[] args) {
        int[] arr={40,1,5,8,4,2,10};
        int len=arr.length;
        System.out.println("before sorting Array");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        Selectionsort.sort(arr, len);
        System.out.println();
        System.out.println("After sorting");

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
