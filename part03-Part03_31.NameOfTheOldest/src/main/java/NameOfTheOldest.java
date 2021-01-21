
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        String name = "";
        while (true){
            String input = scanner.nextLine();
            String[] split = input.split(",");
            if (input.equals("")){
                System.out.println("Name of the oldest: " + name);
                break;
            } else { 
                for (int i=0;i<split.length;i++);
                    if (Integer.valueOf(split[1])>highest){
                        highest = Integer.valueOf(split[1]);
                        name = split[0];
                        System.out.println(highest);

                    }

                }
            }

    }
}
