import java.util.*;

class Missingno
{
    public static void main(String[] args) 
    {
        int n;
        Scanner br =new Scanner(System.in);
        System.out.println("enter the no of total elements");
        n=br.nextInt();
        if(n==1)
        {
            System.out.println("missing : 1");
            br.close();
            return;
        }
        int a[]=new int[n-1];
        System.out.println("enter the elements");
        for(int x=0;x<n-1;x++)
        {
            a[x]=br.nextInt();
            if(a[x]<1||a[x]>n)
            {
                System.out.println("invalid input");
                br.close();
                return;
            }
        }
        int sum=0;
        int expectedsum = (n*(n+1))/2;
        for(int x=0;x<n-1;x++)
        {
            sum =sum +a[x];

        }

        int missing=expectedsum-sum;
        System.out.println("The missing no is:"+ missing);
        
        br.close();
        
    }
}