import java.util.*;

public class Coupon
{
    public static void main(String[] args) 
    {
        HashSet hs=new HashSet<Integer>();
        System.out.println("Enter number of distinct coupon: ");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt(),count=0,raNo=0;
        Random r =new Random();
        sc.close();
        while(count<=no)
        {
            boolean b=hs.add(r.nextInt(50));
            if(b)
             count++;
            raNo++;
        }
        System.out.println("total random no needed to hava all distinct no is= "+raNo);
    }
}