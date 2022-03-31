import java.util.Scanner;
public class Ans3 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter marks of 5 subjects:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int total;
            double per;

            total = a+b+c+d+e;
            per = total/5.0;

            System.out.println("\nMarks 1: "+a+"\nMarks 2: "+b+"\nMarks 3: "+c+"\nMarks 4: "+d+"\nMarks 5 :"+e);
            System.out.println("\nTotal = " + total);
            System.out.println("Percentage = " + per);
        }   
    }
}
