
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last Number?");
        int total = 0;
        int input = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i<=input; i++){
            total = total+i;
        }

        System.out.println("The sum is "+ total);
           
            
    }
}

