import java.util.Arrays;

public class Anagram {
    public static boolean CheckAnagram(String s1,String s2)
    {
       char[] s1Check= s1.toCharArray();
       char[] s2Check= s2.toCharArray();
       Arrays.sort(s1Check);
       Arrays.sort(s2Check);
       return Arrays.equals(s1Check, s2Check);
    }
    public static void main(String[] args) {
        String s1,s2;
        s1="listen";
        s2="Ailent";
       boolean Result= Anagram.CheckAnagram(s1, s2);
        System.out.println("Anagram  is "+Result);
    }
    
}
