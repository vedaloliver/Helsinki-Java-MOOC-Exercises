
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Suitcase {
    // class to hold all the items
    // maximum weight of the suitcase
    private int maximumWeight;
    // a list containing the item object of all the items present
    private ArrayList<Item> Items;
    private int counter;

  
    
    public Suitcase(int maximumWeight){
        // we only ask for the maximum weight 
        this.maximumWeight = maximumWeight;
        this.counter = 0;
        this.Items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        // if the totalweight of the suitcase + weight of the new item is < than 
        // the max weight of the suitcase
        if (totalWeight()+item.getWeight() <= maximumWeight){
            // add to counter
            counter++;
            // add it to the array
            Items.add(item);
        }
    }
    
    public void printItems(){
        for (Item i:Items){
            System.out.println(i);
        }
        
    }
    public int totalWeight(){
        // simple loop to count the weight of everything accumualted
        int weightCounter = 0;
        for (Item i:Items){
            weightCounter += i.getWeight();
        }
        return weightCounter;
    }
    
    public Item heaviestItem(){
        // if empty reutrn null
        if (Items.isEmpty()){
            return null;
        }
        // create  a new item object with the first index
        Item Heaviest = Items.get(0);
        
        for (Item i:this.Items){
            // if the height is less than that first index it replaces it
            if(i.getWeight()>Heaviest.getWeight()){
                Heaviest = i;
                
            }
        }
        // returns the new item object
        return Heaviest;
    }
    public String toString(){
        // here they wanted to ask if no items were present how would i say no
        // so i converted all the ints to strings
        String counterString = String.valueOf(counter);
        String itemAnt = "item";
        // if it equled 0 then its 0
        if (counterString.equals("0")){
            counterString = "no";
        }
        // if it didnt equal no then i would have an s on the end 
        if (!(counter == 1)){
            itemAnt = "items";
            
        }
        return counterString+" "+ itemAnt+ " (" + totalWeight() + " kg)";
    }
    
}
