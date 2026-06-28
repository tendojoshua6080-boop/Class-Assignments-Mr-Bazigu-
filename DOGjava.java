package animals;

public class Dog extends Animals {

    public Dog() {
        super();
    }

    public Dog(String sound, String name) {
        super(sound, name);
    }

    @Override
    public void getName() {
        System.out.println("The dog name is: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog makes: " + sound);
    }
}
