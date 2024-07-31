import java.util.Scanner;

public class incometaxcal {
    public static void main(String[] args) {
        
        System.out.println("Enter your salary");
        Scanner sc = new Scanner(System.in);
        int income =  sc.nextInt();
        int Tax;
        if(income < 500000)
        {
            Tax = 0;
            System.out.println("Tax is zero");
        }
        else if(income >= 500000 && income < 1000000 ) {

            Tax = (int) (income*0.2);
            System.out.println("Tax is:" +Tax);
        }
        else{
            Tax = (int) (income * 0.3);
            System.out.println("Tax is :" +Tax);
        }
    }
}
