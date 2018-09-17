import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args) 
    {
        System.out.println("enter the value of a ,b and c form your quadratic equation");
        int [] quadratic=new int[3];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            quadratic[i]=sc.nextInt();
        }
        sc.close();    
        double delta=Math.pow(quadratic[1], 2)-4*quadratic[0]*quadratic[2];
        if(delta<0)
        {
            System.out.println("there are no real roots.");
            System.exit(0);
        }
        delta=Math.sqrt(Math.pow(quadratic[1], 2)-4*quadratic[0]*quadratic[2]);
        double root1=(-quadratic[1]+delta)/2*quadratic[0];
        double root2=(-quadratic[1]-delta)/2*quadratic[0];
        System.out.println("two roots are:->"+root1+" and "+ root2);
    }
}