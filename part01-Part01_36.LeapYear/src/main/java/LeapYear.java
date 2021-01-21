
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int num = Integer.valueOf(scan.nextLine());
        
        if (num % 4 == 0  && !((num % 100 == 0))){
            System.out.println("The year is a leap year.");
        } else if ((num % 400 == 0)  && (num % 100 == 0)){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
