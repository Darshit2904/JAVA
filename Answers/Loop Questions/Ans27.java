import java.util.Scanner;

public class Ans27
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: "); 
            int n = sc.nextInt();
            int s1=0,s2=0,s3=0;
            
            while(n!=0)
            {
                if(n<0)
                {
                    s1 += n;
                }
                else if(n>0)
                {
                    if(n%2==0)
                    {
                        s2 += n; 
                    }
                    else
                    {
                        s3 += n;
                    }
                }
                System.out.print("Enter a number: ");
                n = sc.nextInt();
            }
            System.out.println("Sum of Negative Numbers = "+s1);
            System.out.println("Sum of Positive Even Numbers = "+s2);
            System.out.println("Sum of Positive Odd Numbers = "+s3);
        }   
    }
}