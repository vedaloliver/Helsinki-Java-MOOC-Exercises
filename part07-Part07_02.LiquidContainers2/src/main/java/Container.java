/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Container {
   private int amount;
   
   public Container(){
       this.amount = 0;
   }
   
   public int contains(){
       return this.amount;
   }
   
   public void add(int amount){
       if (this.amount+amount>100 & (!(amount<0))){
           this.amount = 100;
       
       }else if ((!(amount<0))){
       this.amount += amount;
        }
   }
   
   public void remove(int amount){
       if (this.amount-amount <0){
           this.amount = 0;
       }else{
       this.amount -= amount;
        }
   }
   
   public String toString(){
       return contains()+ "/100";
   }
    
}
