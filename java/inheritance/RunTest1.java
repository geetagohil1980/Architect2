package inheritance;

public class RunTest1 {
    public static void main(String[] args) {


        System.out.println("parent class is Cat");
        Cat c = new Cat();
        c.Animalcolour();
        c.Animallanguage();
        c.Animalname();
        c.Animalpet();

        System.out.println();

        System.out.println("child class is Dog");
        Dog d = new Dog();
        d.Animalcolour();
        d.Animallanguage();
        d.Animalname();
        d.Animalpet();



        System.out.println();

        System.out.println("child class is Monkey");
        Monkey m = new Monkey();
        m.Animalcolour();
        m.Animallanguage();
        m.Animalname();
        m.Animalpet();

        System.out.println();


        System.out.println(" child class is Tiger");
        Tiger T = new Tiger();
        T.Animalcolour();
        T.dangeranimal();

    }
}
