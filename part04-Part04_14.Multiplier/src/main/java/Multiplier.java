/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Multiplier {
    private int number;
    public Multiplier(int number){
        this.number = number;
    }
    public int multiply(int number){
        int multi = this.number*number;
        return multi;
    }
}
