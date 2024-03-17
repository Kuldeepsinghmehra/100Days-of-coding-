import java.util.ArrayList;

class bruteLeader{
    public static ArrayList<Integer> Leader(int[] arr,int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            boolean leader=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    leader=false;
                    break;
                }

            }
            if(leader==true)
            {
                list.add(arr[i]);

            }
            
        }
        
        return list;

    }
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        int n=arr.length;
        ArrayList<Integer> list=Leader(arr, n);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));

        }
        

        
    }
}