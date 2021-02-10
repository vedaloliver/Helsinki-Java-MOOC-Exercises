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
public class Recipes {
    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();
    
    public Recipes(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        for (String ingredient:ingredients){
            this.ingredients.add(ingredient);
        }
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.time;
    }
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public void printIngredients(){
        System.out.println(this.ingredients);
    }
    @Override
    public String toString(){
        return this.name+", cooking time: "+this.time; 
    }
   
    }
   

