import java.util.Scanner;

public class Ans22 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a string: ");
            String a = sc.nextLine();
            int c1=0,c2=0;

            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
                {
                    c1++;
                }
                else if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U')
                {
                    c1++;
                }
                else
                {
                    c2++;
                }
            }
            System.out.print("No. of Vowels = "+c1);
            System.out.print("\nNo. of Consonants = "+c2);    
        }   
    }   
}
