
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLength = 0;
        String name = "";
        int ageTotal = 0;
        int no = 0;
        while (true){
            String input = scanner.nextLine();
            String[] split = input.split(",");
            if (input.equals("")){
                System.out.println("Longest name: " + name);
                System.out.println(no);
                System.out.println(ageTotal);
                double avgAge = (double) ageTotal/no;
                System.out.println("Average of the birth years:" + avgAge);
                break;
            } else { 
                for (int i=0;i<split.length;i++);
                              
                    if (split[0].length()>nameLength){
                        nameLength = split[0].length();
                        name = split[0];
                        no++;
                        ageTotal = ageTotal+Integer.valueOf(split[1]);
                    } else if (!(split[0].length()>nameLength)){
                        no++;
                        ageTotal = ageTotal+Integer.valueOf(split[1]);
                    }
            }
        }
    }
}
