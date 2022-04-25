package JavaSamples.Exercises;

//This is how to swap the numbers without using third variable

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a=20,b=10;
        System.out.println("A is "+a+" b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A is "+a+" b is "+b);
    }
}
