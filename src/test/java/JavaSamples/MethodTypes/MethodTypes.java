package JavaSamples.MethodTypes;

public class MethodTypes {
    //Void method. There is no return type
    public void DoVoid() {
        System.out.println("This is a void method.There is no return type");
    }

    //This is how to define a method with return type as string
    public String DoString() {
        String name = "Dimuthu Ramachandra";
        System.out.println("Name is " + name);
        System.out.println("This is a method with string type");
        return name;
    }

    //This is how to define a method with return type as int
    public int DoInt() {
        int age = '5';
        System.out.println("Age is " + age);
        System.out.println("This is a method with int type");
        return age;
    }

    //This is how to define a method with return type as boolean
    public boolean DoBoolean() {
        boolean Status = false;
        int x='1';
        int y='3';
        int z=x+y;
        if(z==5){
            Status=true;
            System.out.println("Status is " + Status);
        }
        else {
            System.out.println("Status is wrong "+Status);
        }
        System.out.println("This is a method with boolean type");
        return Status;
    }

    //This is how to define a method with return type as a string
    public String[] DoArray(){
        String[] information=new String[4];
        information[0]="A";
        information[1]="B";
        information[2]="B";
        information[3]="B";
        return information;
    }
}
