package buoi6.baitap.bai2;


public class Lion extends Animal3 {
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
}