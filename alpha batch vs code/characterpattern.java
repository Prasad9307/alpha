public class characterpattern {
    public static void main (String args[])
    {
        int n = 4;
        char ch = 'A';

        for(int line=1; line<=n; line++)
        {
            for(int charc=1; charc<=line; charc++)
            {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }

    }

}
