import java.util.Scanner;
public class Ans7 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the currenc in rupees:");
            double rs = sc.nextDouble();
            double usd;

            usd = rs*0.013;
            System.out.println("Currency in USD is :" + usd);
        }   
    }   
}
