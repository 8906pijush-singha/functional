import java.util.*;

public class FlipCoin
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many time you want to flip the coin.");
        int n=sc.nextInt(),count=0;
        sc.close();
        Random r=new Random();//random class of util package to have random nos.
        for(int i=0;i<n;i++)
        {
            if(r.nextInt(2)==1)
                count++;       //counting the no of times head came
        }
        System.out.println("Percentage of heads: "+(double)count/n*100);
        System.out.println("Percentage of tails: "+(double)(n-count)/n*100);
        /* tail =total no of flips -no of times head came*/
    }
}