import java.util.*;
public class Fibonacci
 {
    public static void main(String[] args)
    {
     int a=0,b=1,c,n;
     Scanner br=new Scanner(System.in);
     System.out.println("Enter the no to be displayed in series ");
     n=br.nextInt();
     System.out.println("The Fibonacci series is as : ");
     System.out.print(a+","+b);
     for(int x=0;x<=n;x++)
     {
        c=a+b;
        System.out.print(","+ c);
        a=b;
        b=c;
     }
     br.close();
    }
}
