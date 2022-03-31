import java.util.Scanner;

public class Ans13 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            prime(a,b);
        }   
    }   

    static void prime(int x, int y)
    {
        int i,j,c=0;
        for(i=x;i<=y;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }    
            if(c==2)
            {
                System.out.print(i+" ");
            }
            c=0;
        }
    }
}
