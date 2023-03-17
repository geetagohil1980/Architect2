package practice1;

public class DoWhile4 {
    public static void main(String[] args) {
        int i =10;
        int odd = 3;
        int even =4;
        System.out.print("odd number ");

        do{
            System.out.print(odd + " ");
            odd=odd+3;
            i++;
        }while (i<=50);
        System.out.println();




        System.out.print("Even number ");
        i=10;
        do{
            System.out.print(even + " ");
            even=even+4;
            i++;
        }while (i<=50);


    }
}
