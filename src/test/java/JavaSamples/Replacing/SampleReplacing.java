package JavaSamples.Replacing;

public class SampleReplacing {
    public static void main(String []args) {

        String name="Kenath55@#$dimuthu1234567890-=!@#$%^&*()_+";
        String emptyString="";

        //This is how to remove characters and special characters from a string
        String RemovingSpecialCharactersAndCharacters=name.replaceAll("[^0-9]","");
        System.out.println("Removing Special Characters And Characters "+RemovingSpecialCharactersAndCharacters);

        //This is how to remove special characters from a string
        String nameWithoutSpecialCharacters=name.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Removing special characters :"+nameWithoutSpecialCharacters);

        //This is how to remove special characters & numbers from a string
        String nameWithoutSpecialCharactersAndNumbers=name.replaceAll("[^a-zA-Z]","");
        System.out.println("Removing special characters and Numbers :"+nameWithoutSpecialCharactersAndNumbers);

        //This is how to remove numbers only from a string when there are special characters includes in a string
        String nameWithoutOnlyNumbers=name.replaceAll("[0-9]","");
        System.out.println("Removing numbers and keeping special characters:"+nameWithoutOnlyNumbers);

        //Replace a character with a character
        String Gender="Male";
        String GenderAfterReplacingACharacter=Gender.replaceAll("M","Fem");
        System.out.println("Replacing a characters with another character :" +GenderAfterReplacingACharacter);

        //Remove spaces
        String Address="No 6, Test Road, Colombo  09";
        String AddressWithoutSpaces=Address.replaceAll("\\s","");
        System.out.println("Removing spaces in a string :" +AddressWithoutSpaces);

        //Replace First character when there are multiple characters from same letter in a string

        String City="Ambalanmgoda";
        String CityAfterReplacingFirstCharacter=City.replaceFirst("A","D");
        System.out.println("Replacing First Character :" +CityAfterReplacingFirstCharacter);


        //This is how to remove first 5 characters from a string
        String lastName="Ramanayaka";
        String nameAfterRemovedFirstFive=lastName.substring(5);
        System.out.println("Removing first characters :"+nameAfterRemovedFirstFive);

        //This is how to remove last 3 characters from a string
        String nameAfterRemovedLastThree=lastName.substring(0,lastName.length()-3);
        System.out.println("Removing last characters :"+nameAfterRemovedLastThree);

        //Removing spaces from both ends in a string
        String FirstName="  dim ramax ";
        String FirstNameAfterTrim=FirstName.trim();
        System.out.println("Removing spaces from both end :"+FirstNameAfterTrim);

        //Getting the length of a string(Calculating including spaces
        String LastName="dim rama ";
        System.out.println("Length of the String is "+LastName.length());

        System.out.println(FirstName.concat(lastName));

        String Nameplus=FirstName+lastName;
        System.out.println(Nameplus);

        //This is how to check if a string is not nul
        if (emptyString!= null && !emptyString.isEmpty()){
            System.out.println("Name is not null & empty: "+name);
        }
        else {
            System.out.println("String is empty");
        }
        String message="  Additional screen can be purchased separately. You cannot unsubscribe till 2021-11-30.";
        String Date=message.replaceAll("[^-0-9]","");
        System.out.println("Date is "+Date);
    }
}
