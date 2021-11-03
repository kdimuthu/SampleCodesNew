package JavaSamples.StartExamples;

public class Sample1 {
    public static void main(String[] args) {

        int rowCount=5;
        for(int i=0;i<rowCount;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
