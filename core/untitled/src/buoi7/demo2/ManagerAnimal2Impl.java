package buoi7.demo2;

public class ManagerAnimal2Impl implements IManagerAnimal,SuperAnimal{


    @Override
    public void addAnimal() {
        IManagerAnimal.super.addAnimal();
    }


    @Override
    public void deleteAnimal() {

    }

    @Override
    public boolean demo() {
        return false;
    }

}
