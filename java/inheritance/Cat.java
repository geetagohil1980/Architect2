package inheritance;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Cat extends Animal {
    /*
    Animal colour
    Animal language
    Animal name
    Animal pet


     */
    public void Animalcolour(){
        System.out.println("my Animal color is black and white");
    }
    public void Animallanguage(){
        System.out.println("My Animal say mew + wolf + hoop hoop");

    }

    public void Animalname(){
        System.out.println("My cat name =  july" + " "+ " my dog name is Roco" + " " + "my Monkey name is MOTI" );
    }
    public void Animalpet() {
        System.out.println(" cat,dog and monkey is pet Animal");
    }

}

