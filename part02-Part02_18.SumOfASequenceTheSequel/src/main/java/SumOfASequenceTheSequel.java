
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("First Number?");
        int input = Integer.valueOf(scanner.nextLine());   
        System.out.println("Last Number?");
        int input2 = Integer.valueOf(scanner.nextLine());
        for (int i = input; i<=input2; i++){
            total = total+i;
        }

        System.out.println("The sum is "+ total);
           
            
    }
}
