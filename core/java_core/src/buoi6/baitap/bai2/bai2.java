package buoi6.baitap.bai2;

public class bai2 {

    public static void main(String[] args) {

        Animal3[] animals = new Animal3[3];
        Animal3 lion = new Lion();
        animals[0] = lion;

        Animal3 elephant = new Elephant();
        animals[1] = elephant;

        Animal3 monkey = new Monkey();
        animals[2] = monkey;

        for (Animal3 animal: animals){
            animal.makeSound();
        }

    }
}
