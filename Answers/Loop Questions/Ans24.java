import java.util.Scanner;

public class Ans24 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a=31;  //Since there are 31 days in month of August
            int days=0;

            for (int i = 1; i <= a; i++) 
            {
                if(i%2==0)
                {
                    days++;
                }   
            }
            System.out.println("No. of Days Kunal can go out in August are "+days);
        }   
    }   
}
