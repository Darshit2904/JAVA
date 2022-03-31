import java.util.Scanner;

public class Ans5 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter First number:");
            int n1 = sc.nextInt();
            System.out.println("Enter Second number:");
            int n2 = sc.nextInt();
            int x = n1*n2;
            int temp,hcf,lcm;

            while(n2!=0)
            {
                temp = n2;
                n2 = n1%n2;
                n1 = temp;
            }
            hcf = n1;
            lcm = x/hcf;
            System.out.println("HCF = "+hcf);
            System.out.println("LCM = "+lcm);
        }   
    }   
}
