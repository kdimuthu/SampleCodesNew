package JavaSamples.Exercises;

public class Student {
    public static void main(String[] args) {
        EnterStudentRecordsAndPrint();

    }
    public static void EnterStudentRecordsAndPrint(){
        String[][] studentTable={{"StudentId","Name","Subject","Marks"},{"PS001","Dimuthu","Chemistry","57"},
                {"PS001","Dimuthu","Physics","68"},{"PS001","Dimuthu","Maths","80"}};
        //Print the table headers
        System.out.print(studentTable[0][0]+"\t"+"\t");
        System.out.print(studentTable[0][1]+"\t"+"\t");
        System.out.print(studentTable[0][2]+"\t"+"\t");
        System.out.println(studentTable[0][3]+"\t"+"\t");
        //Print first user records
        System.out.print(studentTable[1][0]+"\t"+"\t");
        System.out.print(studentTable[1][1]+"\t"+"\t");
        System.out.print(studentTable[1][2]+"\t"+"\t");
        System.out.println(studentTable[1][3]+"\t"+"\t");
        //Print second user records
        System.out.print(studentTable[2][0]+"\t"+"\t");
        System.out.print(studentTable[2][1]+"\t"+"\t");
        System.out.print(studentTable[2][2]+"\t"+"\t");
        System.out.println(studentTable[2][3]+"\t"+"\t");
        //Print third user records
        System.out.print(studentTable[3][0]+"\t"+"\t");
        System.out.print(studentTable[3][1]+"\t"+"\t");
        System.out.print(studentTable[3][2]+"\t"+"\t");
        System.out.println(studentTable[3][3]+"\t"+"\t");
    }
}
