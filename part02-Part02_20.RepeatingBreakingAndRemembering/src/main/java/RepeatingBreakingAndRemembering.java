
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int total = 0;
        int no = 0;
        int even = 0;
        int odd = 0;
   
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: "+ total);
                System.out.println("Numbers: "+ no);
                System.out.println("Average: "+ ((double) total/no));
                System.out.println("Even: "+ even);
                System.out.println("Odd: " + odd);
                break;
            }else if ((input != -1) && (input % 2 == 0)) {
                System.out.println(input);
                total = total + input;
                no = no + 1;
                even = even + 1;
   
            }else if ((input != -1) && (input % 2 != 0)) {
                System.out.println(input);
                total = total + input;
                no = no + 1;

                odd++;

            }
        }
    }
}
