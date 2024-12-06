package buoi6.btvnn;

public abstract class Lion extends ManagerAnimal {
    public void roar() {
        System.out.println(" Lion is roaring");
    }

    @Override
    public void eat() {
        System.out.println(" Lion is eating");
    }
    @Override
    public void makeSound() {
        System.out.println(" Lion is roaring");
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting");
    }
}
