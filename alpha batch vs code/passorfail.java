import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        
        System.out.println("Enter the marks: ");
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        String type = Marks >= 33 ? "Pass" : "Fail";
        System.out.println(type);

    }
}
