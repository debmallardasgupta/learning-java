package pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": Meow 🐈");
    }

    @Override
    public void play() {
        energy -= 5;
        hunger += 5;
        happiness += 10;
        clamp();
        System.out.println(name + " chased a laser!");
    }
}
