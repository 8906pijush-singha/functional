import java.util.Scanner;

public class permutation 
{
    static int count=0;  
    public static void main(String[] args) 
    { 
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        sc.close();

        int n = str.length(); 
        permutation permutation = new permutation(); 
        permutation.permute(str, 0, n-1);
    }
    private void permute(String str, int l, int r) 
    { 
        if (l == r)
        { 
           count++;
           System.out.print(count+" ");
           System.out.println(str);
           
        } 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i);
//                System.out.println(" str1"+str+" l="+l+" i="+i ); 
                permute(str, l+1, r); 
//str = swap(str,l,i); 
//                System.out.println(" str2"+str+" l="+l+" i="+i);
            } 
        } 
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 