package animals;

public class TestAnimal {

    static <T extends Animal> boolean isSameSpecies(T animal1, T animal2){
        return animal1.getClass().equals(animal2.getClass());
    }

    public static void main(String[] args) {
        System.out.println(isSameSpecies(new Dog(), new Dog()));
    }
}
