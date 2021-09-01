package factoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("faline");
        System.out.println("animal1 sound : "+animal1.makeSound());

        Animal animal2 = factoryAnimal.getAnimal("canine");
        System.out.println("animal2 sound : "+animal2.makeSound());
    }
}
