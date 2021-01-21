
public class HealthStation {
    private int weighingz;

    public HealthStation() {
        this.weighingz = 0;
    }
    
    
   

    public int weigh(Person person) {
        this.weighingz++;
        return person.getWeight();
        
    }
   
    public void feed(Person person){
        person.setWeight(weigh(person)+1);
    }
    public int weighings(){
        return this.weighingz;
        
        
    }

}
