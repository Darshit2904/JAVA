import java.util.Scanner;

public class Ans11 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the Principal: ");
            int p = sc.nextInt();
            System.out.print("Enter the Rate of Interest: ");
            double r = sc.nextDouble();
            System.out.print("Enter the time: ");
            int t = sc.nextInt();
            double a,ci;

            a = p*Math.pow((1+r/100), t);
            ci = a - p;

            System.out.print("Compound Interest = "+ci);
        }   
    }   
}
