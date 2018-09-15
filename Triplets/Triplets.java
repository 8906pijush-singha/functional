import java.util.Scanner;

public class Triplets
{
    public static void main(String[] args)
    { 
        System.out.println("enter the length of your array:");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int count =0;
        int [] arr=new int[len];
        System.out.println("enter eliments: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("the distincts trplets are:");
        for(int i=0;i<len-2;i++)
        {
            for(int j=i+1;j<len-1;j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        count++;
                        System.out.print(arr[i]+" "+ arr[j]+ " "+ arr[k]+"\n");
                    }
                   
                }
            }
        }
        System.out.println("the no of distinct triplets are:"+count);

    }
}