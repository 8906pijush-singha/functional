import java.util.Random;
import java.util.Scanner;

public class Gambler
{
    public static void main(String[] args) 
    {
        int wins=0;
    //    Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount of your stock:");
        int stk=sc.nextInt();
        System.out.println("enter your target:");
        int trgt=sc.nextInt();
        System.out.println("enter the no of times you want to play:");
        int no=sc.nextInt();
        int n=no;
    /*    System.out.println("enter a no from 0 to 9 on which you want to bet");
        int bet=sc.nextInt();*/
        sc.close();
        while(stk>0&&no>0)
        {
            if (Math.random()>0.5)
            {  
                stk++;
                wins++;
                no--;
                if(stk==trgt)
                {
                    System.out.println("you have achived your target...congrats!!!");
                    break;
                }
                

            }
            else
            {
                stk--;
                no--;
            }

        }
        System.out.println("the no of times you have won="+wins );
        System.out.println("the no of times you have lost="+(n-wins) );
        System.out.println("percentage of win="+(double)wins/n*100 );
        System.out.println("percentage of lose="+(double)(n-wins)/n*100 );
    }
}