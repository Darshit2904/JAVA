import java.util.Scanner;

public class Ans16 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = input.nextInt();
            System.out.print("Ener r : ");
            int r = input.nextInt();
            int nfact = 1, rfact = 1, nrfact = 1;
            
            for (int i = 0; i < n; i++) {
                nfact *= (n - i);
            }
            for (int i = 0; i < r; i++) {
                rfact *= (r - i);
            }
            for (int i = 0; i < (n-r); i++) {
                nrfact*=(n-r-i);
            }
            
            double ncr = nfact/(rfact*nrfact);
            double npr = (ncr*rfact);
            System.out.println("NCR is : " + ncr);
            System.out.println("NPR is : " + npr);
        }   
    }   
}