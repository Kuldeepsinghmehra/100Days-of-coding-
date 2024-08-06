public class countVowelConstNQT {
    public static void returnFunction(String s)
    {
        int vowel=0;
        int constant=0;
        int special=0;
        int number=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
            {
                ch=Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') 
                {
                    vowel++;
                }else{
                    constant++;
                }

            }else if(ch>='0' && ch<='9'){
                number++;
            }else{
                special++;
            }
        
        }
        System.out.println("vowel"+vowel);
        System.out.println("constant"+constant);
        System.out.println("special"+special);
        System.out.println("number"+number);


    }
    public static void main(String[] args) {
        String value="geeks for geeks121";
        countVowelConstNQT.returnFunction(value);
        
    }
    
}
