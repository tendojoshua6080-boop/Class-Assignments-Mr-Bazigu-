package animals

public class Animals {

    protected String sound;
    protected String name;

    public Animals() {
        sound = "Unknown";
        name = "Unknown";
    }

    public Animals(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    public void getName() {
        System.out.println("Animal name is: " + name);
    }

    public void makeSound() {
        System.out.println("Animal sound is: " + sound);
    }
}
