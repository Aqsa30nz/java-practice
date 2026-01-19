import java.util.*;
public class Factorial
 {
    public static void main(String[] args) {
        int f=1;
        int x;
        int n;
        Scanner br=new Scanner(System.in);
        System.out.println("enter value of n");
        n=br.nextInt();
        for(x=1;x<=n;x++)
        {
            f=f*x;
        }
        System.out.println("The factorial of "+ n + " is: "+f);
    br.close();

    }
    
}
