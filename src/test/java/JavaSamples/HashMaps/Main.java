package JavaSamples.HashMaps;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        SampleHash obj=new SampleHash();
        obj.getName();
        System.out.println("Name is"+obj.getName());
        Map<String, String> MyInfo=obj.getHash();
        System.out.println("Hash is "+MyInfo.get("x"));
        PassInformationFromArrayToHashMap obj1=new PassInformationFromArrayToHashMap();
        obj1.PassInformationToHashMap("Name,Age,Gender,City,Mobile,CivilStatus","Dimuthu,25,Male,Colombo,0713044935,Married");
    }
}
