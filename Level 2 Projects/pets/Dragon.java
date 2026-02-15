package pets;

public class Dragon extends Pet {

    public Dragon(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": ROAR 🔥");
    }

    @Override
    public void play() {
        energy -= 25;
        hunger += 20;
        happiness += 30;
        clamp();
        System.out.println(name + " burned a village!");
    }
}
