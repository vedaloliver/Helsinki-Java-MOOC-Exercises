/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> msgs;
    
    public MessagingService(){
        this.msgs = new ArrayList<>();
    }
    public void add(Message message){
        if (message.getContent().length()<= 280){
            this.msgs.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return this.msgs;
        
    }
    }
   
