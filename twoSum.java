public class twoSum {
    public static String returnArray(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int sum=0;
        while(start<end)
        {
            sum=arr[start]+arr[end];
            if(sum==target)
            {
                return "YES";
            }else if(sum<target)
            {
                start++;
            }else{
                end--;
            }
            

        }
        return "No";

    }
    public static void main(String[] args) {
        int[] arr={2,5,6,8,11};
        String result=twoSum.returnArray(arr, 14);
        System.out.println(result);

        
        
    }
    
}
