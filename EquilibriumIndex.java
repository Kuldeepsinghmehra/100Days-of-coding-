public class EquilibriumIndex {
   public static String equilibrium(int arr[]) {
        // code here
     int leftsum=0;
     int totalsum=0;
     for(int i=0;i<arr.length;i++)
     {
         totalsum+=arr[i];
         
     }
     for(int i=0;i<arr.length;i++)
     {
         int rightsum=totalsum-leftsum-arr[i];
         if(leftsum==rightsum)
         {
             return "true";
         }
         leftsum+=arr[i];
     }
        return "false";
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,2,2,1};
        String result=EquilibriumIndex.equilibrium(arr);
        System.out.println(result);

        
    }
    
}
