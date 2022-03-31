import java.util.Scanner;

public class Ans1
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            max(a,b,c);
            min(a,b,c);
        }   
    }

    static void max(int x, int y, int z)
    {
        if(x>y && x>z)
        {
            System.out.println("Maximum = "+x);
        }
        else if(y>x && y>z)
        {
            System.out.println("Maximum = "+y);
        }
        else
        {
            System.out.println("Maximum = "+z);
        }
    }

    static void min(int x, int y , int z)
    {
        if(x<y && x<z)
        {
            System.out.println("Minimum = "+x);
        }
        else if(y<x && y<z)
        {
            System.out.println("Minimum = "+y);
        }
        else
        {
            System.out.println("Minimum = "+z);
        }
    }
}