import java.util.Scanner;

class sumofn{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
    
        while(i <= n ){
        
            sum = sum + i;
            i++;

        }

        System.out.println("Sum of n number is : " +sum);
    }
}