package buoi6.btvnn;

import buoi6.baitap.bai2.Animal3;

public abstract class ManagerAnimal {
    private Animal3[] animals;
    public String name;
    public int age;

    public abstract void eat();

    public abstract void makeSound();

    // Thêm phương thức action() trong lớp trừu tượng Animal
    public abstract void action();

    private int numberCurrentAnimal;
}
