import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Books> bookDeets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication date:");
            int pub = Integer.valueOf(scanner.nextLine());
            bookDeets.add(new Books(name, pages, pub));
        }
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        for (Books i:bookDeets){       
        if (info.equals("everything")){
            System.out.println(i);
        }else if (info.equals("name")){
            System.out.println(i.getName());
        }
        }
    }
}

