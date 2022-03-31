import java.util.Scanner;

public class Ans9 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter number of matches played: ");
            int match = sc.nextInt();
            int total=0;
            System.out.print("Enter number of times player got out from "+match+" matches: ");
            int out =sc.nextInt();
            double avg;

            for (int i=1;i<=match;i++) 
            {
                System.out.print("Enter runs in match "+i+": ");
                int runs = sc.nextInt();
                total += runs;
            }
            avg = total/out;
            System.out.println("Batting Average = "+avg);
        }   
    }   
}
