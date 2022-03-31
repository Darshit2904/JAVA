import java.util.Scanner;
public class Ans10 
{
    public static void main(String[] args) 
    {
        try( Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter 2 numbers:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for (int i = n1; i <=n2; i++) 
            {
                int x=i;
                int n=0;
                while(x!=0)
                {
                    x /= 10;
                    n++;
                }
                int sum=0;
                x=i;
                while(x!=0)
                {
                    int a = x%10;
                    sum += Math.pow(a, n);
                    x /= 10;
                }
                if(sum==i)
                {
                    System.out.println(i + "  is Armstrong number");
                }
                else
                {}
            }
        }   
    }
}
