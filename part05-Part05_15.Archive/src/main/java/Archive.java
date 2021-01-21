/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Archive {
    String identification;
    String name;
    
    public Archive(String Identification, String name){
        this.identification = Identification;
        this.name = name;
    }
    public String getId(){
        return this.identification;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Archive)){
            return false;
    }
        Archive comparedEntry = (Archive) compared;
        
        return (this.identification.equals(comparedEntry.identification));
    }
    
    public String toString(){
        return getId()+ ": "+getName();
    }
        
    
}
