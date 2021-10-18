package JavaSamples.HashMaps;

import java.util.HashMap;

public class HashExample1 {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> myInformation = new HashMap<String, String>();
        // Add keys and values (Country, City)
        myInformation.put("Name", "Dimuthu");
        myInformation.put("Age", "40");
        myInformation.put("Gender", "Male");
        myInformation.put("City", "Colombo");
        //Print every element
        System.out.println(myInformation);

        //To access the values
        System.out.println("Name is "+myInformation.get("Name"));

        //Access keys & values
        for (String i : myInformation.keySet()) {
            System.out.println("key: " + i + " value: " + myInformation.get(i));
        }
        //Access values
        System.out.println("Keys are "+myInformation.keySet());
    }
}
