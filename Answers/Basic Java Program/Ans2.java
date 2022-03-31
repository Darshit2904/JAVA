import java.util.Scanner;
public class Ans2 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello "+ name +", Welcome to Java Programing ");
        }
    }
}
