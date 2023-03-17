package practice1;

public class DoWhile5 {
    public static void main(String[] args) {

        int i = 0;
        int even=2;
        int odd=1;
        System.out.print("Even number");
        do{
            System.out.print(even + "," + " ");
            even=even+2;
            i++;

        }while (i<33);

        System.out.println();

        System.out.print("odd number");
        i=0;
        do{
            System.out.print(odd + " , "  );
            odd=odd+2;
            i++;
        }while (i<=33);


    }
}
