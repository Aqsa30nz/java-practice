import java.util.*;

class Maxmin
{
    public static void main(String args[])
    {
        int n,y;
        Scanner br = new Scanner(System.in);
        System.out.println("enter the no of terms in an array");
        n=br.nextInt();
        int a[]=new int[n];
        System.out.println("enter the terms:");
        for(y=0;y<n;y++)
        {
            a[y]=br.nextInt();
        }
        int max = findMax(a);
        System.out.println("the maximum no found is :"+ max);
        int min = findMin(a);
        System.out.println("The minimum no found is :"+min);

        br.close();
    }
    static int findMax(int a[] )
    {
        int x;
        int l=a.length;
        int max= a[0];
        for(x=1;x<l;x++)
        {
            if(a[x]>max)
                max=a[x];
        }
    return max;
    }
    static int findMin(int a[])
    {
        int min = a[0];
        for(int x=1;x<a.length;x++)
        {
            if(min>a[x])
                min=a[x];
        }
        return min;
    }
}
