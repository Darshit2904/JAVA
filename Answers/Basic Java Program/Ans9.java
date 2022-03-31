import java.util.Scanner;
public class Ans9 
{
    public static void main(String[] args) 
    {
        try( Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a string: ");
            String a = sc.next();
            int len = a.length()-1;
            String b = "";
            for (int i = len; i>=0; i--) 
            {
                b += a.charAt(i);
            }
            if(b.equals(a))
            {
                System.out.println("Its a palindrome");
            }
            else
            {
                System.out.println("Its not a palindrome");
            }
        }
    }
}
