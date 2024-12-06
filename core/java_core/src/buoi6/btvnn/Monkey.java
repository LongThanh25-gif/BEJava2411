package buoi6.btvnn;

public abstract class Monkey extends ManagerAnimal {
    @Override
    public void eat() {
        System.out.println("Monkey is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering");
    }
}
