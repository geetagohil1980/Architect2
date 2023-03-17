package practice1;

public class DoWhile2 {
    public static void main(String[] args) {



        int i = 1;
        int odd = 1;
        int even = 2;
        System.out.println("odd number");

        do {
            System.out.print(odd + " ");
            odd=odd +2;
            i++;


        }while (i<=20);
        System.out.println();

        System.out.println("Even number");
        i =1;

        do{
            System.out.print(even + " ");
            even=even +2;
            i++;

        }while (i<=20);









    }
}
