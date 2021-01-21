
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("First name:");
            String First = scanner.nextLine();
            if (First.isEmpty()){
                break;
            }
            System.out.println("Last:");
            String Last = scanner.nextLine();
            if (Last.isEmpty()){
                break;
            }
            System.out.println("Identification :");
            String num = scanner.nextLine();
            infoCollection.add(new PersonalInformation(First, Last,num));
            
         
        }
        for (PersonalInformation i:infoCollection){
            System.out.println(i.getFirstName()+ " "+i.getLastName());
        }

    }
}
