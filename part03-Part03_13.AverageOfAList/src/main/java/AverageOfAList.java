
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> list = new ArrayList<>();
       while (true){
       int input = Integer.valueOf(scanner.nextLine());
       if (input == -1){
           break;
       }
       list.add(input);
    }  
    int sum = 0;
    int no = 0;
    for (int i: list){
        sum = sum + i;
        no++;
    }
    
    double avg = (double) sum/no;

    System.out.println("Average: "+ avg);  
    }
}
