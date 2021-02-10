/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 * @author ojwar
 */
import java.util.*;
public class UserInterface {
    private Points instance;
    private Scanner scan;
    

    public UserInterface(Points instance,Scanner scan){
        this.instance = instance;
        this.scan = scan;
    }
        
    public void start(){
        
        while(true){
            System.out.println("gimme grade");
            int inputInt = Integer.valueOf(scan.nextLine());
            
            if (inputInt == -1){
                instance.pointAverage();
                instance.pointAveragePassing();
                instance.passPercentage();
                instance.gradeDistribution();
                break;

            }
            
            if (inputInt>=0 & inputInt<=100){
                instance.add(inputInt);
            }else{
                System.out.println("Invalid");
            }
        }
        
    }
}
