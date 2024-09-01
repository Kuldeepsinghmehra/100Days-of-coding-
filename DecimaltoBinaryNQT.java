class DecimaltoBinaryNQT{
    public static void main(String[] args) {
       int decimal=4;
       int rem=0;
       StringBuilder answer=new StringBuilder();
       while(decimal!=0)
       {
        rem=decimal%2;
        answer.append(rem);

        decimal=decimal/2;
       }
       answer.reverse();
       System.out.println(answer);
       
    }
}