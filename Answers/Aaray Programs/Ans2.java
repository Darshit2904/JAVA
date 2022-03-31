import java.util.Scanner;

public class Ans2 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number of elements you want: ");
            int n = sc.nextInt();

            int[] a = new int[n];
            System.out.print("Enter the numbers:\n");
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }

            int[] b = new int[a.length];
            int j=0;
            System.out.print("Aaray in reverse is:\n");
            for(int i=a.length-1;i>=0;i--)
            {
                b[j]=a[i];
                System.out.println(b[j]);
                j++;
            }
            
        }   
    }   
}
