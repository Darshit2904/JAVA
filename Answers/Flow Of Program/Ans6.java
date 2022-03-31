import java.util.Scanner;

public class Ans6 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            double n,sum=0;
            System.out.print("Enter a number: ");
            n = sc.nextDouble();
            sum = n;
            while(n!=0)
            {
                n = sc.nextDouble();
                sum = sum + n;
                if(n==0)
                {      
                    break;
                }
            }
            System.out.print("Sum = "+sum);
        }   
    }   
}
