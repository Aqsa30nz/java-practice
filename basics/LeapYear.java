import java.util.*;

public class LeapYear
 {
    public static void main(String[] args) 
    {
    Scanner br=new Scanner(System.in);
    System.out.println("enter the year to be checked");
    int y=br.nextInt();
    if(y%4==0&&y%100!=0||y%400==0)
    {
        System.out.println(y+" is a leap year" );
    }
    else 
    {
        System.out.println(y+" is not a leap year");
    }
    br.close();
    }
}
