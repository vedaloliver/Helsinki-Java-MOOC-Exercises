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

public class UserInterface {
    private TodoList todo;
    private Scanner scan;
    
    public UserInterface(TodoList todo,Scanner scan ){
        this.todo = todo;
        this.scan = scan;
    }
    public void start(){
        while(true){
        System.out.println("Command: ");
        String input = scan.nextLine();
            
            if (input.equals("add")){
                while(true){
                    System.out.println("To add: ");
                    String inputTask = scan.nextLine();
                    todo.add(inputTask);
                    break;
                }
            } else if(input.equals("list")){
                while(true){
                    todo.print();
                    break;
                    }

            } else if(input.equals("remove")){
                while(true){
                    System.out.println("Which one is removed? ");
                    int inputRemove = Integer.valueOf(scan.nextLine());
                    todo.remove(inputRemove);
                    break;
                    }

            } else if(input.equals("stop")){
                break;
            }
        }
    }
}

