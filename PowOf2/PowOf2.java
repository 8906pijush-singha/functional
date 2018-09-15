public class PowOf2
{
    public static void main(String[] args) 
    {
        int n=Integer.parseInt(args[0]);// converting String to int
        int pow=1;
        for(int i=0;i<=n;i++)
        {
            System.out.println("2 to the power "+i+ "= "+pow);// Printing the table
            pow=pow*2;
        }
            
    }
}