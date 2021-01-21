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
public class Stack {
    private ArrayList<String> Stack;
    
    public Stack(){
        this.Stack = new ArrayList<>();
    }
    public void add(String value){
        this.Stack.add(value);
    }
    public ArrayList<String> values(){
        return this.Stack;
    }
    public boolean isEmpty(){
        if (this.Stack.isEmpty()){
            return true;
        }
        return false;
    }
    public String take(){
        String last = this.Stack.get(this.Stack.size()-1);
        this.Stack.remove(this.Stack.get(this.Stack.size()-1));
        return last;
    }
    
}
