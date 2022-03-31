import java.util.Scanner;

public class Ans7 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            System.out.print("Enter the power: ");
            int b =sc.nextInt();
            int pow=1;

            for (int i=1;i<=b;i++) 
            {
                pow = pow*a;
            }
            System.out.println(pow);
        }
    }   
}
