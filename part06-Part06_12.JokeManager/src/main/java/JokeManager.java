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
public class JokeManager {
    private ArrayList<String> list;
    
    public JokeManager(){
        this.list = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        list.add(joke);
    }
    
    public String drawJoke(){
        Random draw = new Random();
        int index = 0;
        String get = "";

        if (list.isEmpty()){
            get = "Jokes are in short supply.";
        }else{
            index = draw.nextInt(list.size());
            get = list.get(index);

        }
        return get;
    }
    
    public void printJokes(){
        for (String i:list){
            System.out.println(i);
        }
    }
}
