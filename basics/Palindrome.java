import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        String s="",s2="";
        Scanner br=new Scanner(System.in);
        System.out.println("enter the no or word to be converted to palindrome");
        s=br.nextLine();
        
        /*String s=Integer.toString(n); 
        if from Integer to string */

        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            s2=ch+s2;                   // s2=s.charAt(x)+s2;
        }
        String s3=s+s2;
        System.out.println("the palindrome formed is "+s3); 
        br.close();
    }
}
