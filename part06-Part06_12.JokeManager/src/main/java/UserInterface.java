if/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager instance;
    private Scanner scan;
    
    public UserInterface(JokeManager instance, Scanner scan){
        this.instance = instance;
        this.scan = scan;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands:\n" +
            "1 - add a joke\n" +
            "2 - draw a joke\n" +
            "3 - list jokes\n" +
            "X - stop");

            String input = scan.nextLine();
            
            if (input.equals("1")){
                System.out.println("Write the joke to be added");
                String inputJoke = scan.nextLine();
                instance.addJoke(inputJoke);
            }else if(input.equals("2")){
                System.out.println(instance.drawJoke());
            } else if (input.equals("3")){
                instance.printJokes();
            }else if (input.equals("X")){
                break;
            }else{
                System.out.println("Unknown command");
        
        }
    }
}
}
