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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        list.add(task);
    }
    public void print(){
        int counter = 1;
        for(String i:list){
            System.out.println(counter +": "+ i);
            counter++;
        }
    }
    public void remove(int number){
        list.remove(list.get(number-1));
    }
}

