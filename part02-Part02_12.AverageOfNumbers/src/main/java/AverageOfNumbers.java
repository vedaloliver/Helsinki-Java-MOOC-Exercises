
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int no = 0;


        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number !=  0){
                sum = sum + number;
                no = no + 1;
                System.out.println(sum);

            } else {
                double average = (double) sum/no;
                System.out.println("Average of the numbers: "+ average );
                break;

            }
        }
    }
}
