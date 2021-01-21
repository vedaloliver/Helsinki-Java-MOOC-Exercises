
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "Caput Draconis";
        System.out.println("Password?");
        String first = scan.nextLine();


        if (first.equals(str)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
