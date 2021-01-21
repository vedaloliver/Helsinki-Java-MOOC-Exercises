/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
public class Books {
    private String title;
    private int pages;
    private int pubYear;
    public Books(String bookTitle, int pageCount, int pubYear){
        this.title = bookTitle;
        this.pages = pageCount;
        this.pubYear = pubYear;
    }
    public String getName(){
        return this.title;
    }   
        
    @Override  
    public String toString(){
        return this.title+", " +this.pages+" pages, "+this.pubYear;
    }
    
}
