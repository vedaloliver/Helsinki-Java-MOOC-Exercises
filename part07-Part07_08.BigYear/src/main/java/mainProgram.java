
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Commands command = new Commands(scan);
        userInterface UI = new userInterface(scan,command);
        UI.start();

    }

}
