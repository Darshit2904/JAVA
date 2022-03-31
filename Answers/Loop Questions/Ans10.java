import java.util.Scanner;

public class Ans10 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int sum=0;
            double cgpa;
            System.out.println("Enter marks of 5 subjects out of 100");
            for(int i=1;i<=5;i++)
            {
                System.out.print("Enter marks of subject "+i+":");
                int marks = sc.nextInt();
                if(marks>100)
                {
                    System.out.println("Marks should not be greater than 100");
                    break;
                }
                sum += marks; 
            }
            cgpa = sum/50.0;
            System.out.println("CGPA = "+cgpa);
        }   
    }   
}
