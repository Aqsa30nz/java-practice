import java.util.*;

class Longestword
{
    public static void main(String[] args) 
    {
        String s="";
        int c=0,max=0;
        Scanner br=new Scanner (System.in);
        System.out.println("enter the string");
        s=br.nextLine();
        s=s+" ";
        br.close();

        for (int x=0;x<s.length();x++)
        {
            if(s.charAt(x)!=' ')
            {
                c++;
            }
            else {if(c>max){
                max=c;}
            c=0;
            }
        }
        System.out.println("the longest word is :"+max);
    }
}