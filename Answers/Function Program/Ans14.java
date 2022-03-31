import java.util.Scanner;

public class Ans14 
{
    public static void main(String[] args) 
    {
        int ans = addition();
        System.out.println("Sum = "+ans);   
    }   

    static int addition()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int i,sum=0;
            
            for(i=1;i<=n;i++)
            {
                sum += i;
            }
            return sum;
        }
        
    }
}
