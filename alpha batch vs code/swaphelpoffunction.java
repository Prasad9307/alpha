public class swaphelpoffunction {

    public static void swap(int a, int b){

        int temp = a;
        a = b ;
        b = temp;

        System.out.println("Value of a = " +a);
        System.out.println("Value of b = " +b);


    }
    public static void main(String args[]){
        
        //Swap - exchange a value
        int a = 10;
        int b = 5;
        swap(a,b);

        //swap
        

    }
    
}
