import java.util.Scanner;
public class Ans6 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter 2 numbers: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            if(a>b)
            {
                System.out.println("Largest number is " + a);
            }
            else
            {
                System.out.println("Largest number is " + b);
            }
        }
    }   
}
