/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if (persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    public Person shortest(){
        if (this.persons.isEmpty()){
            return null;
        }
        // assigns a clone. will use the first index of the persons in the room
        // but we will change that
        Person shortest = persons.get(0);
        
        for (Person i:this.persons){
            // if the height is less than that first index it replaces it
            if(i.getHeight()<shortest.getHeight()){
                shortest = i;
                
            }
        }
        return shortest;
    }
    public Person take(){
        // assigns a single person from the shortest in before
        // you kinda followed this idea
        Person shortestPerson = shortest();
        // essentially it took what was in shortestperson and removed it from this.persons
        // i thought as it was private i couldnt do that but maybe not
        this.persons.remove(shortestPerson);
        // returns the next shortest person alowing myself to loop over it
        return shortestPerson;
        
          
    }
    }

