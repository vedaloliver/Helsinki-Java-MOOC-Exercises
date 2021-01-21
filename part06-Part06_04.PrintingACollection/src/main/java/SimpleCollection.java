
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        String output = "";
        if (elements.size() == 1){
            output = "The collection "+ this.name + " has " + elements.size()+ " element:";
        }else if (elements.size()>1){
            output = "The collection "+ this.name + " has " + elements.size()+ " elements:";
        }else if (elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String things = "";
        
        for (String i:elements){
            //int count = 0;
            //if (count==elements.size()-1){
            //    things = things + i;
            //}else{
            if (elements.size() == 1){
                things = things + i;
            //count++;
            } else{
                things = things + i + "\n";
            }
        }
        return output + "\n" + things;
    
    
    }
}
