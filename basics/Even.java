import java.util.Scanner;

public class Even 
{
    public static void main(String[] args) {
        int n,x;
        Scanner br=new Scanner(System.in);
        System.out.println("enter the value of n ");
        n=br.nextInt();
        System.out.print("even no from 1 to "+n+" are:\n");
        for(x=1;x<=n;x++)
        {
           if(x%2==0)
           {
            System.out.println(x);
           }
        }
    }
    
}
