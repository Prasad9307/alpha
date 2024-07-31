public class productcallbyvalue {
   
    public static int multiply(int a, int b){

        int prod = a * b;
        return prod;
    }

    public static void main(String args[]){
        
        int a = 10;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("Multiply of two number= " + prod);

   }
    
}
