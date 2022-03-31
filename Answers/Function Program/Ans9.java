import java.util.Scanner;

public class Ans9 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            factorial(num);
        }   
    }   

    static void factorial(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f *= i;
        }
        System.out.println("Factorial of "+n+" = "+f);
    }
}
