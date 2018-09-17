
import java.util.Scanner;

public class StopWatch
{
    public static void main(String[] args) 
    {
        long start,end;
        System.out.println("............STOP-WATCH...........");
        System.out.println("To start the StopWatch please enter 'Start'");
        Scanner sc=new Scanner(System.in);
        String ip=sc.next();
        if(ip.equalsIgnoreCase("start"))
        {
            start=System.currentTimeMillis();
            System.out.println("StopWatch is running....");
            System.out.println("to stop the StopWatch please enter 'Stop'");
            for(int i=1;i>0;i++)
            {
                String ip1=sc.next();
                if(ip1.equalsIgnoreCase("stop"))
                {
                    sc.close();
                    end=System.currentTimeMillis();
                    System.out.println("Time passed(Sec)-->"+(end-start)/1000);
                    System.exit(0);
                }
                else
                    System.out.println("please enter 'stop' to Stop the StopWatch.");
            }

        }
        else
        System.out.println("Try again and please enter 'Start' this time. ");    
    }
}