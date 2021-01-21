
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int no = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number !=  0){
                no = no + number;
            } else {
                System.out.println("Sum of the numbers: "+ no);
                break;

            }
        }
    }
}
