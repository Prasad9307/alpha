import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float totalsum = a+b+c;
        System.out.println("Bill amount " + totalsum);
        float gst = totalsum+(0.18f * totalsum);
    System.out.println("Bill with 18% tax : "+gst);
}
}
