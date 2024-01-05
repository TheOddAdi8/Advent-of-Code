import java.util.ArrayList;

public class NoahsArk {
    
    public static void main(String[] args) {
        ArrayList<Animal> ark = new ArrayList<Animal>();

        ark.add(new Lion(4, "male"));
        ark.add(new Giraffe(6, 286));

        System.out.println(ark);
    } 

}

class Animal {
    int age;
    String color;
    String pronouns;
    public void exist() {}
    public void beBorn() {}
    public void die() {}
    
}

class Mammal extends Animal {
    int numLegs;
    public void walk() {}
    
}

class Lion extends Mammal {
    String genderOrSexuality;
    public void eatGiraffe() {}

    public Lion(int theNumLegs, String theGender) {
        numLegs = theNumLegs;
        genderOrSexuality = theGender;
    }
    
    
}

class Giraffe extends Mammal {
    int numSpots;
    public void eatLeaves() {}

    public Giraffe(int theNumLegs, int theNumSpots) {

    }
    
}