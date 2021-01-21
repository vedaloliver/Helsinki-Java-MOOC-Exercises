
import java.util.Scanner;

public class MainProgram{ 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics StatisticsOdd = new Statistics();
        System.out.println("Enter numbers: ");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input != -1){
                statistics.addNumber(input);
                if (input % 2 == 0){
                    statisticsEven.addNumber(input);
                }else if (input % 2 != 0){
                    StatisticsOdd.addNumber(input);
                }
            }else if (input == -1){
                    System.out.println("Sum: "+ statistics.sum());
                    System.out.println("Sum of even numbers: "+ statisticsEven.sum());
                    System.out.println("Sum of odd numbers: "+ StatisticsOdd.sum());
                    break;
            }
        }
    }
}
                    
           