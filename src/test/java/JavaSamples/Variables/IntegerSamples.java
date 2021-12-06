package JavaSamples.Variables;

public class IntegerSamples {

    public static void main(String[] args) {
        String y = "0123";
        String x = "123";
        if(y.startsWith("0")){
            x="0"+x;
        }
        if(y.equalsIgnoreCase(x)){
            System.out.println("Numbers are same : S"+y+","+x);
        }
        else {
            System.out.println("Numbers are wrong");
        }


    }
}
