public class kaprekarNQT {
   public static int isKaprekar(int N) {
        int square= N*N;
        String result=Integer.toString(square);
        int size=result.length();
       for(int i=1;i<size;i++)
       {
           String left=result.substring(0,i);
           String right=result.substring(i);
           int leftnum=left.isEmpty() ? 0 : Integer.parseInt(left);
           int rightnum=right.isEmpty() ? 0: Integer.parseInt(right);
           if(leftnum!=0 && rightnum!=0 && leftnum+rightnum==N){
               return 1 ;
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        int num=45;
        kaprekarNQT.isKaprekar(num);

    }
    
}
