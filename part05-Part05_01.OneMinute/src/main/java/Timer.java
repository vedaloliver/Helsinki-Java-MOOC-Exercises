/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Timer {
    private ClockHand hundredth;
    private ClockHand Seconds;
    
    public Timer(){
        this.hundredth = new ClockHand (100);
        this.Seconds = new ClockHand(60);
    }
    public void advance(){
        this.hundredth.advance();
        
        if (this.hundredth.value() == 0){
            this.Seconds.advance();
        }
        
        }
    public String toString(){
            return Seconds + ":" + hundredth;
        }
    }

