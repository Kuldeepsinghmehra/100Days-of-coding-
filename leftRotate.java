public class leftRotate {
    static void solve(int arr[], int n) {
        int first=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        }
    public static void main(String[] args) {
        int n=5;
  
        int arr[]= {1,2,3,4,5};
        solve(arr, n);
        
    }
    
}

