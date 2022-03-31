import java.util.Scanner;

public class Ans8 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the marks out of 100:");
            int marks = sc.nextInt();

            grade(marks);
        }   
    }   

    static void grade(int m)
    {
        if(m>=91 && m<=100)
        {
            System.out.println("AA");
        }
        else if(m>=81 && m<=90)
        {
            System.out.println("AB");
        }
        else if(m>=71 && m<=80)
        {
            System.out.println("BB");
        }
        else if(m>=61 && m<=70)
        {
            System.out.println("BC");
        }
        else if(m>=51 && m<=60)
        {
            System.out.println("CD");
        }
        else if(m>=41 && m<=50)
        {
            System.out.println("DD");
        }
        else if(m<=40)
        {
            System.out.println("Fail");
        }
    }
}
