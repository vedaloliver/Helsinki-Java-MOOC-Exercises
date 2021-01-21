/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author ojwar
 */
public class Hold {
    // same as lugagege
    private int maximumWeight;
    private ArrayList<Suitcase> luggage;
    private int counter;
    
    public Hold (int maxWeight){
        this.maximumWeight = maxWeight;
        this.luggage= new ArrayList<>();
        this.counter = 0;
}

    public void addSuitcase (Suitcase suitcase){
        // this was normally straight forward but since you werent allow to have a constructor totalweight
        // it got confusing
        
        // looped over each luggage item and got their weight
        int weightCounter= 0;
        for (Suitcase i:luggage){
            weightCounter+=i.totalWeight();
        }
        // if the max weight minus the weight already in the hold
        // is more than the weight of an item you want to put in then add it
        if ((this.maximumWeight - weightCounter) >= suitcase.totalWeight()){
                this.luggage.add(suitcase);
                counter++;
        
    }
    }
            
            

    public void printItems(){
        // took a bit of doing but you get it 
        for (int i =0 ; i < counter; i++){
            Suitcase caseItems = luggage.get(i);
            caseItems.printItems();
        }
    }
    public String toString(){
        String counterString = String.valueOf(counter);
        String suitcaseAnt = "suitcase";
        int totalWeight = 0;
        
        for (Suitcase i:luggage){
            totalWeight += i.totalWeight();
        }  
        
        if (counterString.equals("0")){
            counterString = "No";
        }
        if (!(counter == 1)){
            suitcaseAnt = "suitcases";
            
        }
        return counterString+" "+ suitcaseAnt+ " (" + totalWeight + " kg)";
    }        
    }
    
