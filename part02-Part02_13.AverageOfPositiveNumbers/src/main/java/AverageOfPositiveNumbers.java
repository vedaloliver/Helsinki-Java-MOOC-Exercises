
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int sum = 0;
        int no = 0;


        while (true){
            int number = Integer.valueOf(scanner.nextLine());

            if (number >  0){
                sum = sum + number;
                no = no + 1;
                
            }else if (number < 0){
                continue;

            } else {
                if (no == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }else{         
                    double average = (double) sum/no;
                    System.out.println(average );
                    break;
                }
            }
        }
    }
}
