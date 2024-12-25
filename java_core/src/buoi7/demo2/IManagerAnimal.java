package buoi7.demo2;

public interface IManagerAnimal extends SuperAnimal {

    public default void addAnimal() {

    }

    public void deleteAnimal();

    @Override
    boolean demo();
}
