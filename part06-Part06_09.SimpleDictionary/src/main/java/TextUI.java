/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
import java.util.*;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dicts;
    
    public TextUI(Scanner scan, SimpleDictionary dicts){
        this.scanner = scan;
        this.dicts = dicts;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word:");
                String inputWord = scanner.nextLine();
                System.out.println("Translation:");
                String inputTranslation = scanner.nextLine();
                dicts.add(inputWord, inputTranslation);
            } else if(input.equals("search")){
                System.out.println("To be translated:");
                String inputSearch = scanner.nextLine();
                if (dicts.translate(inputSearch)!= null){
                    System.out.println("Translation: " +dicts.translate(inputSearch));
                } else{
                    System.out.println("Word "+ inputSearch+ " was not found");
                }
                
               
            }else{
                System.out.println("Unknown command");
            }
    }
    
}
}
