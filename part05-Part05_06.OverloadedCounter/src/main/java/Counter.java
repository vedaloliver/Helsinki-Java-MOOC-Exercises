/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Counter {
    private int number;
    
    public Counter(int number){
       this.number = number; 
    }
    public Counter(){
        this.number = 0;
    }
    public int value(){
        return this.number;
    }
    public void increase(){
        this.number++;
    }
    public void increase(int increaseBy){
        if (increaseBy >0){
        this.number = this.number + increaseBy;
        }
    }
    public void decrease(){
        this.number--;
    }
    public void decrease(int decreaseBy){
        if (decreaseBy>0){
        this.number=  this.number - decreaseBy;
        }
    }
}
