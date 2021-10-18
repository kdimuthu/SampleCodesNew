package JavaSamples.MethodTypes;

public class Main {
    public static void main(String[] args) {

        MethodTypes objMethodTypes=new MethodTypes();
        objMethodTypes.DoVoid();
        objMethodTypes.DoString();
        objMethodTypes.DoInt();
        objMethodTypes.DoBoolean();
        //This is how to call a method with string type
        String[] ArrayInformation=objMethodTypes.DoArray();
        System.out.println("First Array element is "+ArrayInformation[0]);
        System.out.println("Second Array element is "+ArrayInformation[1]);
    }
}
