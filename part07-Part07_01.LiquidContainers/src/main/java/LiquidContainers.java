
import java.util.Scanner;
//Ballache
public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // have to inialize outside the loop or it resets every loop
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            //inital prints of the values as requested 
            System.out.println("First: "+containerOne+"/100");
            System.out.println("Second: "+containerTwo+"/100");
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            // if it doesnt equal quit then it splits up the command into two and designates the 
            // command and the value 
            }else {
                String[] parts = input.split(" ");
                //defines the command wanted
                String command = parts[0];
                // defines how much is wanted to add/remove etc
                int amount = Integer.valueOf(parts[1]);
                
                if  (command.equals("add")){
                   
                    if (amount >100 - containerOne & amount>0){
                        containerOne =100;
                    }else if (amount>0){
                    containerOne += amount; 
                    }
                    
                    
                }else if (command.equals("move")){
                    // if there is actually anything in container one 
                    if (amount > 0){
                        // if there is so much that it takes all of the liquid from container one 
                        if (amount > containerOne){
                            // adds the remainder of containerOne
                            containerTwo += containerOne;
                            // empties out containerOne 
                            containerOne = 0;
                        } else {
                            // else move as normal
                            containerOne -= amount;
                            containerTwo += amount;
                        }
                        // if there is max amount in container two then set it to the max
                    }if (containerTwo>100){
                        containerTwo = 100;
                        
                    }
                } else if (command.equals("remove")){
                    // if containerTwo has more liquid than the actual amount/
                    // then move as normal
                    if (containerTwo>amount){
                        containerTwo -= amount;
                    }
                    else{
                        // if not hten it resets it to 0
                        containerTwo = 0;
                    }
                
                }
                
            }
        }
    }
}
