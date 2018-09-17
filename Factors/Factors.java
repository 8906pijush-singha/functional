
import java.util.Scanner;
public class Factors
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        
        int n=sc.nextInt(),prime=1;
        sc.close();
        if(isPrime(n)==1)
        {
            System.out.print(n+" itself is a prime number.");
            System.exit(0);
        }
        System.out.println("the prime factors are: ");    
        for(int i=2;i*i<=n;)
        {
            if(n%i!=0)
            {
                i++;
                continue;
            }
            prime=isPrime(i);
            if(prime==1)
            {
                System.out.print(i+" ");
                n=n/i;
                if(n%i!=0)
                {
                    i++;
                }
            }
            if(isPrime(n)==1)
            {
                System.out.print(n);
                System.exit(0);
            }
        }
    }
    private static int isPrime(int n)
    {
        int prime=1;
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               prime=0;
               break;
           }
       }
       return prime;
    }
}