import java.util.Scanner;
public class Ans3 
{
    public static void main(String[] args) 
    {
        
        try(Scanner sc = new Scanner(System.in))
        {
            double i;
            System.out.print("Enter the Principal amount: ");
            int p = sc.nextInt();
            System.out.print("Enter the Rate of Interest: ");
            float r = sc.nextFloat();
            System.out.print("Enter the Time: ");
            int t = sc.nextInt();
        
            i = (p*r*t)/100.0;
            System.out.print("Simple Interest is: "+ i);
        }    
    }
    
}
