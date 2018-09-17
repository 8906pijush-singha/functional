public class WindChill
{
    public static void main(String[] args) 
    {
        System.out.print("the effictive temperature (the wind chill)= ");
        double t=Double.parseDouble(args[0]);
        double v=Double.parseDouble(args[1]);
        if(t>50 || v<3 || v>120 )
        {
            System.out.println("can't evaluate the wind chill as the data is inseretd wrong.");
            System.out.println("please enter again.");
            System.exit(0);
        }
        double windChill=35.74+0.6215*t+((0.4275*t-35.75)*Math.pow(v, 0.16));
        System.out.println(windChill);
    }
}