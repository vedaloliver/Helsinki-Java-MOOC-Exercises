
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container one = new Container();
        Container two = new Container();
        
        while (true) {
            System.out.println("First: "+ one);
            System.out.println("Second" + two);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else {
                String[] parts = input.split(" ");
                //defines the command wanted
                String command = parts[0];
                // defines how much is wanted to add/remove etc
                int amount = Integer.valueOf(parts[1]);
                
                if  (command.equals("add")){
                   
                    if (amount >100 - one.contains() & amount>0){
                        one.add(100);
                    }else if (amount>0){
                        one.add(amount); 
                    }
                    
                    
                }else if (command.equals("move")){
                    // if there is actually anything in container one 
                    if (amount > 0){
                        // if there is so much that it takes all of the liquid from container one 
                        if (amount > one.contains()){
                            // adds the remainder of containerOne
                            two.add(one.contains());
                            // empties out containerOne 
                            one.remove(100);
                        } else {
                            // else move as normal
                            one.remove(amount);
                            two.add(amount);
                        }
                        // if there is max amount in container two then set it to the max
                    }if (two.contains()>100){
                        two.add(100);
                        
                    }
                } else if (command.equals("remove")){
                    // if containerTwo has more liquid than the actual amount/
                    // then move as normal
                    if (two.contains()>amount){
                        two.remove(amount);
                    }
                    else{
                        // if not hten it resets it to 0
                        two.remove(100);
                    }
                
                }
                
            }
        }
    }
}
