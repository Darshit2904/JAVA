import java.util.Scanner;

public class Ans4 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum(a,b);
        }   
    } 
    
    static void sum(int x, int y)
    {
        int sum=0;
        sum = x + y;
        System.out.print("Sum = "+sum);
    }
}
