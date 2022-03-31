import java.util.Scanner;
public class Ans4 
{
    public static void main(String[] args) 
    {
        try( Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter 2 numbers: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            
            System.out.println("Addition = " + (a+b));
            System.out.println("Subtration = " + (a-b));
            System.out.println("Multiplication = " + (a*b));
            System.out.println("Division = " + (a/b));
        }   
    }
}