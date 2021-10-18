package JavaSamples.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PassInformationFromArrayToHashMap {

    public void PassInformationToHashMap(String keyList, String valueList) {

        //Implementing an array & add keys

        ArrayList<String> keys = new ArrayList<>();
        keys.addAll(Arrays.asList(keyList.split(",")));

        System.out.println("Array list size for keys is " + keys.size());

        //Implementing an array & add values
        ArrayList<String> values = new ArrayList<>();
        values.addAll(Arrays.asList(valueList.split(",")));

        System.out.println("Array list size of values is " + values.size());

        //Implementing a hash map & add values in array keysList
        Map<String, String> myInformation = new HashMap<>();
        myInformation.put(keys.toString(), values.toString());

        //Iterating hash map
        for (String i : myInformation.keySet()) {
            System.out.println("key: " + i + " value: " + myInformation.get(i));
        }
    }

}
