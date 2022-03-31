import java.util.Scanner;

public class Ans1
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in)) 
        {
            char[] a = new char[10];
            System.out.println("Enter 10 letters: ");
            for(int i=0;i<10;i++)
            {
                a[i] = sc.next().charAt(0);
            }

            System.out.print("Aaray elements are:\n");
            for(int i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }  
    }
}