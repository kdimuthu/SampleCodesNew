package JavaSamples.ArrayList;

import java.util.ArrayList;

public class SampleArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Steve");
        list.add("Tim");
        list.add("Lucy");
        list.add("Pat");
        list.add("Angela");
        list.add("Tom");

        //displaying elements
        System.out.println("Element list is " + list);

        //Adding "Steve" at the fourth position
        list.add(3, "Ben");
        //displaying elements after adding a new element
        System.out.println("Displaying elements after adding a new element " + list);

        list.set(0, "Dim");
        //Change the element in list
        System.out.println("Changing the first element " + list);

        //get a particular element
        System.out.println("Displaying the second element " + list.get(1));

        //Removing element "Ben"
        list.remove("Ben");
        System.out.println("Removing elements " + list);

        //Removing third element
        list.remove(2);
        System.out.println("Removing third element " + list);

        //Iterating array list
        for (String str : list)
            System.out.println(str);

        
    }

}

