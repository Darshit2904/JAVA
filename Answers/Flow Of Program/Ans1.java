import java.util.Scanner;
public class Ans1
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a year:");
            int x = sc.nextInt();
            if( (x%4==0) || (x%400==0) )
            {
                System.out.println(x + " is a leap Year");
            }
            else
            {
                System.out.println(x + " is not a Leap Year");
            }
        }   
    }
}