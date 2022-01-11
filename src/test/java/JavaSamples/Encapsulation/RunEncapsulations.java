package JavaSamples.Encapsulation;

public class RunEncapsulations {
    public static void main(String[] args) {
        SampleEncapsulation obj=new SampleEncapsulation();
        obj.setAge(10);
        obj.setName("Dimuthu");

        System.out.println("Age is : "+ obj.getAge());
        System.out.println("Name is : "+ obj.getName());

    }
}
