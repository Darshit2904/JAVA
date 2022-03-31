import java.util.Arrays;
import java.util.Scanner;

public class Ans3 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            // System.out.print("Enter number of rows and columns of 1st aaray: ");
            
            int[][] a = new int[2][2];
            int[][] b = new int[2][2];
            int[][] c = new int[2][2];
            
            System.out.println("Enter elements of 1st aaray: ");
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length;j++)
                {
                    a[i][j] = sc.nextInt();
                }    
            }
            //System.out.println(Arrays.toString(a));

            System.out.println("Enter elements of 2nd array: ");
            for (int i = 0; i < b.length; i++) 
            {
                for (int j = 0; j < b[i].length; j++) 
                {
                    b[i][j] = sc.nextInt();   
                }   
            }
            //System.out.println(Arrays.toString(b));

            for (int i = 0; i < c.length; i++) 
            {
                for (int j = 0; j < c.length; j++) 
                {
                    c[i][j] = a[i][j] + b[i][j];  
                }   
            }

            for (int i = 0; i < c.length; i++) 
            {
                System.out.println(Arrays.toString(c[i]));
            }
        }
    }   
}
