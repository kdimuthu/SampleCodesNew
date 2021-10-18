package JavaSamples.LinkedLists;

import java.util.LinkedList;

public class SampleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Linked list is"+cars);

        // Use addFirst() to add the item to the beginning
        cars.addFirst("Toyota");
        System.out.println("After adding first element "+cars);

        // Use addLast() to add the item to the end
        cars.addLast("TATA");
        System.out.println("After adding last element "+cars);

        // Use getFirst() to display the first item in the list
        System.out.println("First element is "+cars.getFirst());

        // Use getFirst() to display the first item in the list
        System.out.println("Last element is "+cars.getLast());
    }
}
