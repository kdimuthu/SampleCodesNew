package JavaSamples.Exercises;

import java.util.ArrayList;
import java.util.HashSet;

//This is how to print common elements of two arrays.

public class Ex2 {
    public static void main(String[] args) {
        int[] array1={2,23,34,44,5,31,22};
        int[] array2={21,23,33,2,23,20,7};
        int i,j;
        ArrayList<Integer> commonElements=new ArrayList();
        HashSet<Integer> commonElementRemoveDuplicates=new HashSet();
        for(i=0;i<array1.length;i++){
            for(j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    commonElements.add(array1[i]);
                    commonElementRemoveDuplicates.add(array1[i]);
                }
            }
        }
        System.out.println("Common Elements are "+commonElements);
        System.out.println("Common Elements After removing duplicates are "+commonElementRemoveDuplicates);
    }
}
