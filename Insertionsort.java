public class Insertionsort {
    public static int[] sort(int[] arr,int N)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }

    

    
    public static int[] swap(int[] arr,int  first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr={10,7,1,2,9,6,8,1,4,10};
        int len=arr.length;
        Insertionsort.sort(arr, len);
        System.out.println("after sorting");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    
}
