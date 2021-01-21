
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> id = new ArrayList<>();
        ArrayList<Archive> details = new ArrayList<>();


        
        while (true){
            System.out.println("Identifier?(empty will stop)");
            String input = scanner.nextLine();
            if (input.isEmpty()){
                for (Archive i:details){
                    System.out.println(i);
                }
                break;
                // print both things
            }
                
            
            System.out.println("Name?(empty will stop)");
            String input2 = scanner.nextLine();
            
            if (!(input2.isEmpty())){
                Archive entry = new Archive(input,input2);
                if (!(details.contains(entry))){
                details.add(entry);
                }
            }
            else if (input2.isEmpty()){
                for (Archive i:details){
                    System.out.println(i);
                }
                break;
                // print both things
                }
            }
        }
    }

