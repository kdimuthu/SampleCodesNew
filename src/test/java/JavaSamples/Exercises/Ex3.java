package JavaSamples.Exercises;

//This is how to find the number of vowels in a word
public class Ex3 {
    public static void main(String[] args) {
        String name="Kdnhth";
        int NumberOfVowels=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                NumberOfVowels++;
            }
        }
        System.out.println("Number of vowels are "+NumberOfVowels);



    }
}
