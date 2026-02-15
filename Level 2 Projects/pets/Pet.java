package pets;

public abstract class Pet {
    protected String name;
    protected int hunger = 50;
    protected int energy = 50;
    protected int happiness = 50;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void speak();
    public abstract void play();

    public void eat() {
        hunger -= 15;
        energy += 10;
        happiness += 5;
        clamp();
    }

    public void sleep() {
        energy += 20;
        hunger += 10;
        clamp();
    }

    protected void clamp() {
        hunger = Math.max(0, Math.min(100, hunger));
        energy = Math.max(0, Math.min(100, energy));
        happiness = Math.max(0, Math.min(100, happiness));
    }

    public void status() {
        System.out.println("\n" + name + " Status:");
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
    }
}