import java.util.Scanner;

public class Ans17 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a string: ");
            String a = sc.nextLine();
            String b = "";

            for(int i=a.length()-1;i>=0;i--)
            {
                b += a.charAt(i);
            }
            System.out.println("String in reverse is:\n"+b);
        }   
    }   
}
