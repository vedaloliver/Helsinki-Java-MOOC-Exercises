
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Name of the file: ");
        try(Scanner scannerFile = new Scanner(Paths.get(input))){
            while (scannerFile.hasNextLine()){
                String  line = scannerFile.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name+", age: "+age+" years");
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
