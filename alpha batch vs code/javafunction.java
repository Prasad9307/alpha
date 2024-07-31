import java.util.*;

public class javafunction{

    public static void printhello(){

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int printsum(int a, int b) {
        int sum = a + b;
        return sum;
        
    }
    public static void main(String args[]){
        

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printsum(a, b);
        System.out.println("Sum of two number: " +sum);
        
    }
    
} 
