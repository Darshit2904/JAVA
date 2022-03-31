import java.util.Scanner;

public class Ans7 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            prime(num);
        }   
    }   

    static void prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is Prime");
        }
        else
        {
            System.out.println(n+" is not Prime");
        }
    }
}