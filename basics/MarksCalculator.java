import java.util.*;

public class MarksCalculator 
{

    public static void main(String[] args) {
        
        Scanner br=new Scanner(System.in);
        System.out.println("enter your marks for physics chemistry and maths respectively out of 100 each ");
        double phy=br.nextDouble();
        double chem=br.nextDouble();
        double maths=br.nextDouble();
        
        MarksCalculator g=new MarksCalculator();
        double total = g.marks(phy, chem, maths);
        System.out.println("the total marks you received out of 300 is ="+total );
         br.close();
    }

    public double marks(double p,double c,double m)
    {
        double t=p+c+m;
        if(t>300)
        System.out.println("MARKS ENTERED ARE OUT OF LIMIT PLEASE CHECK AGAIN");
        else if(t>=250&&t<=300)
        System.out.println("WELL DONE !!!!!");
        else if(t>=200&&t<=250)
        System.out.println("GOOD....YOU'LL DO BETTER SOON!!!");
        else if (t>=150&&t<=200)
        System.out.println("FAIR....TRY TO IMPROVE");
        else 
        System.out.println("POOR......SERIOUSLY NEED IMPROVEMENT ");
        return t;
        
    }

}

