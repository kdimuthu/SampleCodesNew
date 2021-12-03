package JavaSamples.Variables;

public class NullExamples {

    public static void main(String[] args) {
        String name=null;
       if (name == null || name.isEmpty()){
           System.out.println("name is null");
       }
       else {
           System.out.println("Name is showing as "+name);
       }

    }
}
