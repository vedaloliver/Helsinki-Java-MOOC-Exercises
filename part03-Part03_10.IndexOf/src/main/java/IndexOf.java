
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Search for? ");
                input2 = Integer.valueOf(scanner.nextLine());
                break;
            }

            list.add(input);
        }
        for (int i= 0; i<list.size();i++){
            if (input2 == list.get(i)){
                System.out.println(list.get(i)+ " is at index "+ i);
            }
            
            
        }

        // implement here finding the indices of a number
    }
}
