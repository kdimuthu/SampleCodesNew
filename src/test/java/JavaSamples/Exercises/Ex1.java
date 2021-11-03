package JavaSamples.Exercises;

//This is how to find the maximum number of a dataset

public class Ex1 {
    public static void main(String[] args) {
        int max = 0, i;

        int[] dataSet = {4, 54, 43, 121, 56, 20, 12};
        for (i = 0; i < dataSet.length; i++) {

            if (dataSet[i] > max) {
                max = dataSet[i];
            } else
                max = max;
        }
        System.out.println("Largest Number is " + max);
    }
}



