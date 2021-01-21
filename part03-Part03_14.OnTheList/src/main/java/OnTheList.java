
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        String input2 = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Search for? ");
                input2 = scanner.nextLine();
                break;
            }
            
            list.add(input);
        }
        if (list.contains(input2)){
            System.out.println(input2 + " was found!");
        } else {
            System.out.println(input2+ " was not found!");
        }
}

    }

