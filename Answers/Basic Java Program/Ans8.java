import java.util.Scanner;
public class Ans8 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int a=0,b=1;
            int c;

            System.out.print(a + " " + b);
            for (int i = 2; i <= n; i++) 
            {
                c=a+b;
                System.out.print(" " + c);
                a=b;
                b=c;
            }
        }   
    }   
}
