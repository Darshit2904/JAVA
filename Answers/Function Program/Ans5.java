import java.util.Scanner;

public class Ans5 
{
    public static void main(String[] args) 
    {
        float ans = product();
        System.out.print("Product = "+ans);
    }   

    static float product()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter two numbers:");
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            float pro = a * b;
            return pro;
        }    
    }
}
