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

public class Commands {
    private ArrayList<birds> collection;
    private Scanner scanner;
    
    public Commands(Scanner scanner){
        this.collection = new ArrayList<>();
        this.scanner = scanner;
    }
    public void add(){
            String inputName = scanner.nextLine();
            System.out.println("Name:" + inputName);

            String inputLatin = scanner.nextLine();
            System.out.println("Name in Latin: "+ inputLatin);
            collection.add(new birds(inputName,inputLatin));
        }
    
    public void observation(){
         System.out.println("Bird? ");
         String inputName = scanner.nextLine();
         
         for (birds i:collection){
             if (i.getName().equals(inputName)){
                 i.incObs();
                 break;
             } else{
                 System.out.println("Not a bird!");
                 break;
                }
            }
        }
    
    
    public void All(){
        
        for (birds i:collection){
            System.out.println(i);
        }
        System.out.println(collection);
    }
    public void One(){
        System.out.println("Bird?:");
        String inputName = scanner.nextLine();
        
        for (birds i:collection){
            if (i.getName().equals(inputName)){
                System.out.println(i);
            }
        }

    }
    }
