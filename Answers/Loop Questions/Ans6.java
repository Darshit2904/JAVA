import java.util.Scanner;

public class Ans6 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            double per;
            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter the comission amount: ");
            double comission = sc.nextDouble();

            per = (comission/amount)*100;
            System.out.println("Comission Percentage = "+per);
        }   
    }   
}
