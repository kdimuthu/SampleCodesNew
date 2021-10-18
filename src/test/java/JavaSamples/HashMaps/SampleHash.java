package JavaSamples.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class SampleHash {
    public Map<String, String> getHash() {
        HashMap<String, String> myInformation = new HashMap<String, String>();
        myInformation.put("x","25");
        myInformation.put("y","26");
        myInformation.put("z","27");
        return myInformation;
    }

    public String getName(){
        String name="dfd";
        return name;
    }
}
