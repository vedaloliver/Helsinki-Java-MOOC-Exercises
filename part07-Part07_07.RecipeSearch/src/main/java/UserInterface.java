/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojwar
 */
import java.nio.file.Paths;
import java.util.*;
public class UserInterface {
    private Recipes instance;
    private Scanner scan;
    private String file;
    
    public UserInterface(Recipes instance, Scanner scan){
        this.instance = instance;
        this.scan = scan;
        this.file = "";
    }
    
    public static void start(){
        Scanner scanner = new Scanner(System.in);

            System.out.println("File to read");
            String file = scanner.nextLine();
     
            while(true){
                System.out.println("Commands:\n"
                                + "list - lists the recipies\n"
                                + "stop - stops the program\n"
                                + "find name - searches recipes by name\n"
                                + "find cooking time - searches recipes by cooking time\n"
                                + "find ingredient - searches recipes by ingredient");
                
                   String input = scanner.nextLine();

                    if (input.equals("list")){
                        UserInterface.list();
                        
                        
                    
                    }else if (input.equals("find name")){
                        String input2 = scanner.nextLine();
                        System.out.println("Searched word:"+ input2);
                        for (Recipes i:getFileData(file)){
                            if (i.getName().contains(input2)){
                                System.out.println("Recipes: ");
                                System.out.println(i);
                            }
                        }
                        
                    }else if (input.equals("find cooking time")){
                        int input3 = Integer.valueOf(scanner.nextLine());
                        System.out.println("Max cooking time:"+ input3);
                        System.out.println("Recipes");
                        for (Recipes i:getFileData(file)){
                            if (input3>=i.getTime())
                                System.out.println(i);
                        }  
                        
                    }else if(input.equals("find ingredient")){
                        String input4 = scanner.nextLine();
                        System.out.println("Ingredient: "+input4);
                        System.out.println("Ingredients:");

                         for (Recipes i: getFileData(file)){
                             if (i.getIngredients().contains(input4)){
                                 System.out.println(i);
                                    } 
                         }
                         
                      }else if(input.equals("stop")){
                                    break;
                            }
                        } 
                    }
    
     public void list(){
         System.out.println("Recipes:");
          for (Recipes i :getFileData(this.file)){
          System.out.println(i);
                        }
     }
     public static ArrayList<Recipes> getFileData(String file){
        // puts each line onto a list for processing
        ArrayList<String> recipeParts = new ArrayList<>();
        ArrayList<Recipes> recipes = new ArrayList<>();
        //initaliser
        String name;
        int time;

        try (Scanner scannerFile = new Scanner(Paths.get(file))){
            
               while (scannerFile.hasNextLine()){
                    
                    String row = scannerFile.nextLine();
                    // if there isnt an empty line
                    if (!(row.isEmpty())){
                        recipeParts.add(row);
                    // if there is(signifying the end of the reipe    
                    }else{
                        // the first element is the name
                        name = recipeParts.get(0);
                        // the second element is the time
                        time = Integer.valueOf(recipeParts.get(1));
                        // removing these two prior eleemnts
                        recipeParts.remove(0);
                        recipeParts.remove(0);
                        recipes.add(new Recipes(name,time,recipeParts));
                        recipeParts.clear();
                    }
               }
                    if (!recipeParts.isEmpty()) {
                        name = recipeParts.get(0);
                        time = Integer.valueOf(recipeParts.get(1));
                        recipeParts.remove(0);
                        recipeParts.remove(0);
                        recipes.add(new Recipes(name, time, recipeParts));
                        recipeParts.clear();
                }
        } catch (Exception e){
                System.out.println("Error:" + e.getMessage());
                    }
        return recipes;
                }
            } 
    
    