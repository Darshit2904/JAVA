import java.util.Scanner;

public class Ans2 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))   
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            evenodd(num);
        }
    } 
    
    static void evenodd(int n) 
    {
        if(n%2==0)
        {
            System.out.print(n+" is an Even Number");
        }
        else
        {
            System.out.print(n+" is an Odd Number");
        }
    }

}
