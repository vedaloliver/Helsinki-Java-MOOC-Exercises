
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(){
        if (this.day<30){
            this.day+=1;
        }else{
            this.day = 1;
            if (this.month<12){
                this.month +=1;
            }else{
                this.month = 1;
                this.year +=1;
            }
        }
        }
    public void advance(int howManyDays){
        if ((howManyDays+this.day)<=30){
            this.day+=howManyDays;
        }else{
            this.day = (howManyDays+this.day - 30);
            if (this.month<12){
                this.month +=1;
            }else{
                this.month = 1;
                this.year +=1;
            }
        }
        }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day,month,year);
        newDate.advance(days);
        //int no = 0;
        //while (no<= days){
        //    newDate.advance(days);
        //    no+=1;

        
        return newDate;
        
    
    }
}

