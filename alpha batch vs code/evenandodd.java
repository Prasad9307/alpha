import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt(); 
        int D;
        D = n % 2;

        if(D == 0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
    
}
