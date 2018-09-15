import java.util.*;

public class UserName
{
    public static void main(String [] args)
    {
        HashMap hs= new HashMap<String,String>();
        hs.put("pijush110", "Pijush Singha");// this is to have a database to check the user-name.
        hs.put("rahul110", "Rahul Roy");     
        hs.put("Abhi110", "Abhishek Gupta");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the userName: ");
        String user=sc.next();
        sc.close();
        Iterator<Map.Entry<String,String>> itr =hs.entrySet().iterator();
        if(user.length()>=3)
        {   
            while(itr.hasNext())
            {
                Map.Entry<String,String> en=itr.next();
                if(user.equalsIgnoreCase(en.getKey()))//comparing the given user-name with the stored one.
                {
                    System.out.println("Hello!! "+en.getValue()+" ,How are you?????");//printing the proper name of the user.
                    System.exit(0);
                }
            }
            System.out.println("please enter a valid user-name.");
        }
        else
        {
            System.out.println("user-name is too short.");
            System.exit(0);
        }
    }
}