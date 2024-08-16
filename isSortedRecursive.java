public class isSortedRecursive {
    public static boolean isSorted(int[] arr,int N)
    {
        if(N==0||N==1)
        { 
            return true;

        }
        return arr[N-1]>=arr[N-2] && isSorted(arr, N-1);
    }
    public static void main(String[] args) {
        int[] arr={20,23,23,45,78,88,};
        if (isSorted(arr, arr.length)) {
            System.out.println("Sorted");
            
        }else{
            System.out.println("Not sorted");
        }

        
    }
    
}
