public class arrayfunctionargument {

    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks [] = {97, 98, 69};
        update(marks);

        //print
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + "  ");
        }
            System.out.println();
    }
}
