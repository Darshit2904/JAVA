import java.util.Scanner;

public class Ans4 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the price: ");
            double p = sc.nextDouble();
            double a;

            if(p>1000 && p<=3000)
            {
                a = p - p*0.05;
                System.out.println("Your amount after discount = "+a);
            }
            else if(p>3000 && p<=5000)
            {
                a = p - p*0.1;
                System.out.println("Your amount after discount = "+a);
            }
            else if(p>5000 && p<=7000)
            {
                a = p - p*0.12;
                System.out.println("Your amount after discount = "+a);
            }
            else if(p>7000 && p<10000)
            {
                a = p - p*0.15;
                System.out.println("Your amount after discount = "+a);
            }
            else if(p>=10000)
            {
                a = p - p*0.15;
                System.out.println("You have recieved an additional voucher of 1000 Rs");
                System.out.println("Enter 1 if you want to use it now \nEnter 2 if you don't want to use");
                int x = sc.nextInt();
                if(x==1)
                {
                    a = a - 1000;
                    System.out.println("Your amount after discount = "+a);
                }
                else 
                {
                    System.out.println("Your amount after discount = "+a);
                }
            }
        }   
    }   
}