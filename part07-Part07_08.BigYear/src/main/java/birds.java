

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class birds {
    private String name;
    private String latin;
    private int obs;

    public birds(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.obs = 0; 
    }
    public String getName(){
        return this.name;
    }
    public String getLatin(){
        return this.latin;
    }
    public int getObs(){
        return this.obs;
    }
    public void incObs(){
        this.obs++;
    }
    @Override
    public String toString(){
        return getName()+" ("+getLatin()+"): "+getObs()+" observations";
    }
}
