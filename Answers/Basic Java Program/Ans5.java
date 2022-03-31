import java.util.Scanner;
public class Ans5 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter 2 numbers: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            System.out.print("Enter \n1 for + \n2 for - \n3 for x \n4 for / \n");
            int c = sc.nextInt();

            if(c == 1)
            {
                System.out.print("Adiition = " + (a+b));
            }
            else if(c == 2)
            {
                System.out.print("Subtration = " + (a-b));
            }
            else if( c== 3)
            {
                System.out.print("Multiplication = " + (a*b));
            }
            else if(c == 4)
            {
                System.out.print("Division = " + (a/b));
            }
            else
            {
                System.out.print("Invalid input");
            }
        }   
    }   
}
