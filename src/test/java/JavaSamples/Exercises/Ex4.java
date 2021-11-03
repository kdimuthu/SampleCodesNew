package JavaSamples.Exercises;

//This is to find out number which are greater than 100

import java.util.ArrayList;
import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {
        int[] array={12,34,123,345,76,99,102,123};
        ArrayList <Integer> threeDigitNumbers=new ArrayList<>();
        HashSet<Integer> threeDigitElements=new HashSet<>();
        for(int i=0;i<array.length;i++){
        if(array[i]>=100){
            threeDigitNumbers.add(array[i]);
            threeDigitElements.add(array[i]);
        }
        }
        System.out.println("Numbers which is greater than 100 are"+threeDigitNumbers);
        System.out.println("Numbers which is greater than 100 after removing duplicates are"+threeDigitElements);
    }
}
