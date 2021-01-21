
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int input1 = 0;
        int input2 = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where? ");
                input1 = Integer.valueOf(scanner.nextLine());
                System.out.println("To where? ");
                input2 = Integer.valueOf(scanner.nextLine());
                break;
            }

            numbers.add(number);
        }
        for (int i = input1; i<=input2; i++){
            System.out.println(numbers.get(i));
            
            
    } 

    }
}
