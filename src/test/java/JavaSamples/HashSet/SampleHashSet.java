package JavaSamples.HashSet;

import java.util.HashSet;

//A HashSet is a collection of items where every item is unique. Duplicates won't be added

/*In the example above, even though BMW is added twice
it only appears once in the set because every item in a set has to be unique.*/

public class SampleHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println("Only unique record will be added " + cars);
    }
}
