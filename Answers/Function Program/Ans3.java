import java.util.Scanner;

public class Ans3 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            
            eligible(age);
        }   
    }   

    static void eligible(int a)
    {
        if(a>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
