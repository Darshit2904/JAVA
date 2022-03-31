import java.util.Scanner;

public class Ans10 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))   
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            palindrome(num);
        }
    }   
    
    static void palindrome(int n)
    {
        int d,n1,sum=0;
        n1=n;
        while(n>0)
        {
            d=n%10;
            sum = sum*10 + d;
            n=n/10;
        }
        if(sum==n1)
        {
            System.out.println(n1+" is Palindrome");
        }
        else
        {
            System.out.println(n1+" is not Palindrome");
        }
    }
}
