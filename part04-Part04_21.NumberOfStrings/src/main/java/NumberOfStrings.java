
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = 0;
        while (true){
            String str = scanner.nextLine();
            no++;
            if(str.equals("end")){
                no--;
                System.out.println(no);
                break;
            }
        
        }
    }
}
