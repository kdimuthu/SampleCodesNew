package JavaSamples.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        int i,j,rowCount = 4;
        for (i = 1; i < rowCount; i++) {
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}