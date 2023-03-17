package practice1;

public class DoWhile1 {
    public static void main(String[] args) {



    int i =1;
    int odd = 1;
    int even = 2;

        System.out.print("odd number ");

    do {
        System.out.print(odd + " ");
        odd=odd+2;

        i++;
    }while (i <=10);
        System.out.println();
        System.out.print("even number ");
        i=1;

        do{
            System.out.print(even + " ");
            even=even+2;
            i++;

        }while (i<=10 );



    }
}
