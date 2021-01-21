/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Team(String home,String visiting, int homeP, int visitingP){
        this.homeTeam = home;
        this.visitingTeam = visiting;
        this.homePoints = homeP;
        this.visitingPoints = visitingP;
    }
    public String getHomeTeam(){
        return homeTeam;
    }
    public String getVisitingTeam(){
        return visitingTeam;
    }
    public int getHomePoints(){
        return homePoints;
    }
    public int getVisitingPoints(){
        return visitingPoints;
    }
    
    @Override
    public String toString() {
        return this.homeTeam +", "+ this.visitingTeam+", "+this.homePoints+", "+ this.visitingPoints;
    }
}
