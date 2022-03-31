import java.util.Scanner;
public class Ans4 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number whose table you want:");
            int x = sc.nextInt();

            for (int i = 1; i <= 10; i++) 
            {
                System.out.println(x+" x "+i+" = "+(x*i));   
            }
        }
    }   
}
