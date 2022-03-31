import java.util.Scanner;

public class Ans2 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the units used: ");
            double units = sc.nextDouble();
            double bill=0;

            if(units<=100)
            {
                bill = units*1.20;
            }
            else if(units>100 && units<300)
            {
                bill = 100*1.20 + (units-100)*2;
            }
            else if(units>300)
            {
                bill = 100*1.20 + 200*2 + (units-300)*3;
            }
            System.out.println("Electricity Bill = "+bill);
        }   
    }   
}
