package buoi6.btvnn;

public abstract class Elephant extends ManagerAnimal {
    public void trumpet() {
        System.out.println(" Elephant is trumpeting");
    }
    @Override
    public void eat() {
        System.out.println(" Elephant is eating");
    }
    @Override
    public void makeSound() {
        System.out.println(" Elephant is trumpeting");
    }
}
