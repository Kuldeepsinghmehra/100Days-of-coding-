public class outerParenthesis {
    public static void ReturnAnswerBrute(String p)
    {
        int count=0;
        String res="";

        for (int i=0;i<p.length();i++)
        {
            if(p.charAt(i)=='(' && count++>0)
            {
                res+=p.charAt(i);
                
            }
            if(p.charAt(i)==')' && count-->1)
            {
                res+=p.charAt(i);
             
            }
        }
        System.out.println(res);
    }
    public static void ReturnAnswerOptimal(String p)
    {
        int opening=0;
        int closing=0;
        int start=0;
        String res="";
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i)=='(')
            {
                opening++;
            }
            else if (p.charAt(i)==')') {
                closing++;
                
            }
            if (opening==closing) {
                res+=p.substring(start+1, i);
                start=i;
            }
            
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        String S = "((()))(())";
        outerParenthesis.ReturnAnswerBrute(S);
        outerParenthesis.ReturnAnswerBrute(S);
    }
    
}
