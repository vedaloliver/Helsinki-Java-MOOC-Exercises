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
public class userInterface {
    private Scanner scanner;
    private Commands command;
    
    public userInterface(Scanner scanner,Commands command ){
        this.scanner = scanner;
        this.command = command;
    }
    public void start(){
       
        
        while(true){
            System.out.println("? ");
            String input = scanner.nextLine();
            if (input.equals("Add")){
                command.add();
                start();
                   
            }else if (input.equals("Observation")){
                command.observation();
                start();
            }else if (input.equals("All")){
                command.All();
                start();
            }else if (input.equals("One")){
                command.One();
                start();
            }else if (input.equals("Quit"))
                break;
            }
    }
            
}
