package JavaSamples.StartExamples;

public class Sample2 {
    public static void main(String[] args) {

        int rowCount=5;
        for(int i=0;i<rowCount;i++){
            for(int j=i;j<rowCount;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
