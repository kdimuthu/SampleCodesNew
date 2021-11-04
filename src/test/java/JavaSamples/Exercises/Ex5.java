package JavaSamples.Exercises;

//THis is to find out an array contains a specific number
public class Ex5 {
    public static void main(String[] args) {

        int[] array={3,32,4,6,12,28};
        int matchingNumber=32;
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==matchingNumber){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Array is having the number "+matchingNumber);
        }
        else {
            System.out.println("Array does not have the number "+matchingNumber);
        }
    }
}
