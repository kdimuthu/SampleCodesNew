package JavaSamples.Polymorphisam;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myDog = new Dog();       // Create a Dog object
        Animal myCat = new Cat();       // Create a Cat object
        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}
