
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;

        while (true){
            String input = scanner.nextLine();
            String[] split = input.split(",");
            if (input.equals("")){
                System.out.println("Age of the oldest:" + highest);
                break;
            } else { 
                for (int i=0;i<split.length;i++);
                    if (Integer.valueOf(split[1])>highest){
                        highest = Integer.valueOf(split[1]);
                        System.out.println(highest);

                    }

                }
            }
        }
    }