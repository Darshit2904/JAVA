import java.util.Scanner;

public class Ans6 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the radius of circle:");
            double r = sc.nextDouble();

            circumference(r);
            area(r);
        }   
    }   

    static void circumference(double r1)
    {
        double c;
        c = 3.14 * r1;
        System.out.print("Circumference = "+c);
    }

    static void area(double r1)
    {
        double a;
        a = 3.14 * r1 * r1;
        System.out.print("\nArea = "+a);
    }
}
