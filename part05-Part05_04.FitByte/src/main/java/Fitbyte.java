/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Fitbyte {
    private int age;
    private int resting;
    
    public Fitbyte(int age, int restingHeart){
        this.age = age;
        this.resting = restingHeart;
    }
    public double maximumHeartRate(){
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return maximumHeartRate;

    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (maximumHeartRate() - this.resting) * percentageOfMaximum + this.resting;
    }
    
}
