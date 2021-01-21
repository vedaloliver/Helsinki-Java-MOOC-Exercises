
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String cubeNo = scanner.nextLine();
            if (cubeNo.equals("end")){
                break;
            }
            int number = Integer.valueOf(cubeNo);
            System.out.println(number*number*number);
            }
    }
}
      
