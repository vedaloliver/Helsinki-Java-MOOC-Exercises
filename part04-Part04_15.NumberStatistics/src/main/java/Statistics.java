
public class Statistics {
    private int number;
    private int sum;
    public Statistics(){
        this.number = 0;
        this.sum =0;
    }
    public void addNumber(int number){
        this.number++;
        this.sum = this.sum+number;
    }
    public int getCount(){
        return this.number;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        double averageNo = 0;
        double average = 0;
        
        if (getCount() == 0){
            return averageNo;    
        } else{
            average = (double) sum() / getCount();
            return average;
        }
    }
}
