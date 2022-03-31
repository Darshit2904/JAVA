import java.util.Scanner;

public class Ans25 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int sum=0,d;
            int num=n;

            while(n>0)
            {
                d = n%10;
                sum = sum + d;
                n = n/10;
            }
            System.out.println("sum of digits of "+num+" = "+sum);
        }   
    }   
}
