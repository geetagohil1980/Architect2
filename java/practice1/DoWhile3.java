package practice1;

public class DoWhile3 {
    public static void main(String[] args) {

        int i = 5;
        int even = 2;
        int odd = 1;

        System.out.println(" Even number");
        do{
            System.out.print(even + " ");
            even=even +2;
            i++;






        }while (i<=50);
        System.out.println();

        System.out.print("odd number");
        i=1;

        do{
            System.out.print(odd + " ");
            odd=odd +2;
            i++;

        }while (i<=50);


    }
}
