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
public class Points {
    private ArrayList<Integer> list;

    public Points(){
       this. list = new ArrayList<>();
       }
    
    public void add(int score){
        list.add(score);
    }
    
    public void pointAverage(){
        int total = 0;
        int counter = 0;
       
        
        for (int i:list){
            total+=i;
            counter++;
        }
        System.out.println(total+ ","+counter);
        double average = (double) total/counter;
        String averageString = String.valueOf(average);
        
        System.out.println("Point average (all): "+ averageString);
        }
    
    public void pointAveragePassing(){
        int total = 0;
        int counter = 0;
        String end = "";
               
        for (int i:list){
            if (i>=50){
            total+=i;
            counter++;
                }
            }     
   
            double average = (double) total/counter;
            String averageString = String.valueOf(average);
      
            if (counter<1){
                System.out.println("-");;
            }else{
                System.out.println("Point average (passing): "+ averageString);
            }   
        } 
        
    
    public void passPercentage(){
        int counter = 0;
        int passing = 0;
        
        
        
        for (int i:list){
            if (i>=50){
                passing++;
            }
            counter++;
        }
        double percentage = (double) 100*passing/counter;
        String percentageString = String.valueOf(percentage);
        System.out.println("Pass percentage: "+percentage);
    }
     public void gradeDistribution() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : list) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade,i));
        }
    }

    private String stars(ArrayList<Integer> grades, int number) {
        String star = "";
        for (Integer grade : grades) {
            if(grade==number) {
                star+="*";
            }
        }
        return star;

    }
}

   
