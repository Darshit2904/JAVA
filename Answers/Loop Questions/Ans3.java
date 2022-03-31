import java.util.Scanner;

public class Ans3 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the amount of numbers to be added: ");
            int a = sc.nextInt();
            int t=0;
            double avg;

            for (int i=1;i<=a;i++) 
            {
                System.out.print("Enter number "+i+" : ");
                int n = sc.nextInt();
                t += n;   
            }
            avg=t/a;
            System.out.print("Average of "+a+" entered numbers = "+avg);
        }   
    }   
}