import java.util.Scanner;

public class Harmonic
{
    public static void main(String[] args) 
    {
        System.out.println("enter the value of n: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        float nth=1;
        for(int i=2;i<=n;i++)
        {
            nth=nth+(float)nth/i;//calculating nth harmonic value.
        }
        System.out.println(n+"th hermonic value is ="+nth);    
    }
}