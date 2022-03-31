import java.util.Scanner;

public class Ans5 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            double dis;
            System.out.print("Enter the coordinates of point A: ");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            
            System.out.print("Enter the coordinates of point B: ");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            dis = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
            System.out.println("The distance between points A and B = "+dis);
        }   
    }   
}
