package JavaSamples.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertArraylistToHashMap {
    public static void main(String[] args) {

        //Implementing an array & add values
        ArrayList<String> list = new ArrayList<>();
        list.add("Name");
        list.add("Age");
        list.add("Gender");
        list.add("City");

        //Implementing a hash map & add values in array list
        Map<String, String> myInformation = new HashMap<>();

        for (String information : list) {
            myInformation.put(list.get(0), "Dimuthu");
            myInformation.put(list.get(1), "25");
            myInformation.put(list.get(2), "Male");
            myInformation.put(list.get(3), "Colombo");
        }
        System.out.println("List are"+myInformation);

        //Iterating hash map
        for (String i : myInformation.keySet()) {
            System.out.println("key: " + i + " value: " + myInformation.get(i));
        }
    }


}
