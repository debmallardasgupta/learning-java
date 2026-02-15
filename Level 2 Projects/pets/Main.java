package pets;

public class Main {
    public static void main(String[] args) {

        Pet p1 = new Dog("Buddy");
        Pet p2 = new Cat("Misty");
        Pet p3 = new Dragon("Draco");

        Pet[] pets = {p1, p2, p3};

        for (Pet p : pets) {
            p.speak();     // Polymorphism
            p.play();      // Different behavior
            p.eat();
            p.status();
        }
    }
}
