public class Timelapse
 {
    public static void main(String args[])throws InterruptedException
    {
        int x;
        for(x=10;x>=0;x--)
        {
            System.out.println(x);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY BIRTHDAY");
    }
    
}
