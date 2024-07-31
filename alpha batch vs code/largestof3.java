import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // int A = sc.nextInt();
            // int B = sc.nextInt();
            // int C = sc.nextInt();

            int A = 12; 
            int B = 25;
            int C = 8;
           
            if(( A >= B) && (A >= C))
            {
                System.out.println("A Is the largest");
            } 
            else if((B >= A ) && (B >= C))
            {
                System.out.println("B Is the Largest");
            } 
            else
            {
                System.out.println("C Is the largest");
            }
    }
    
}
