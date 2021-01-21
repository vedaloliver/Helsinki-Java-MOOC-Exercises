
public class Main {

    public static void main(String[] args) {
        
        HealthStation childrensHospital = new HealthStation();
        
        Person ethan = new Person ("Ethan",1,110,7);
        
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        
        childrensHospital.feed(ethan);
        
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());



    }
       
}
