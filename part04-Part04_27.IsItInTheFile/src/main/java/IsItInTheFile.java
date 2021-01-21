
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner scanner2 = new Scanner(Paths.get(file))){
            while (scanner2.hasNextLine()){
                lines.add(scanner2.nextLine());
            }
            while (true){
                System.out.println("Search for:");
                String searchedFor = scanner.nextLine();
        
                if (lines.contains(searchedFor)) {
                    System.out.println("Found!");
                    break;
                } else {
                    System.out.println("Not found.");
                    break;
        }  
            }
        } catch (Exception e){
            System.out.println("Reading the files "+ e.getMessage()+ " failed.");
        }
    }
    }

