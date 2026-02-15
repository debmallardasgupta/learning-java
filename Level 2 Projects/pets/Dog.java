package pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": Woof! 🐕");
    }

    @Override
    public void play() {
        energy -= 10;
        hunger += 10;
        happiness += 15;
        clamp();
        System.out.println(name + " played fetch!");
    }
}