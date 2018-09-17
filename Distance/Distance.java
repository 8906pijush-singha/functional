import java.util.Scanner;

public class Distance
{
    public static void main(String[] args) 
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        float distance=(float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println(" the Euclidean distance from the point ("+x+","+y+") to the origin (0, 0) is ="+distance);
    }
}