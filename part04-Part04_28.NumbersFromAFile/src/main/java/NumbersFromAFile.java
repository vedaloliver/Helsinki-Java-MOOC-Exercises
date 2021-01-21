
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class NumbersFromAFile {
    int  = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        int numbers = 0;
        try (Scanner scanner2 = new Scanner(Paths.get(file))){
            while rrayList<String> lines = new ArrayList<>();

        System.out.print("File? ");
        String (scanner2.hasNextLine()){
                lines.add(scanner2.nextLine());
            }
            
            while(true){
                System.out.print("Lower bound? ");
                int lowerBound = Integer.valueOf(scanner.nextLine());
                System.out.print("Upper bound? ");
                int upperBound = Integer.valueOf(scanner.nextLine());
                for (String i:lines){
                 
                    if (Integer.valueOf(i)>lowerBound & Integer.valueOf(i)<=upperBound){
                        numbers++;
                    }
                }
            System.out.println("Numbers: "+ numbers);
            break;
                
            }
    }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
    }
}
}
