import java.util.Scanner;

public class Ans12 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            triplet(a,b,c);
        }
    }   

    static void triplet(int x, int y, int z)
    {
        if((x*x == y*y + z*z) || (y*y == z*z + x*x) || (z*z == x*x + y*y))
        {
            System.out.println(x+","+y+","+z+" is a Pythagorian Triplet");
        }
        else
        {
            System.out.println(x+","+y+","+z+" is not a Pythagorian Trilet");
        }
    }
}
