
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Points points = new  Points();
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        // making a pointslist class
        // going to make a user interface class
        UserInterface begin = new UserInterface(points,scanner);
        begin.start();
        
    }
}
