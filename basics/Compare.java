import java.util.*;
public class Compare 
{
    public static void main(String[] args) {
        int a,b;
        Scanner br=new Scanner(System.in);
        System.out.println("enter the values of a and b");
        a=br.nextInt();
        b=br.nextInt();
        if(a==b){
            System.out.println("the numbers "+a+" and "+ b+" are equal");
        }
        else if(b<a)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
      }
    }

