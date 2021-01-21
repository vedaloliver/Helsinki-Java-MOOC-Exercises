
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
  

    public Money plus(Money addition){
        // jesus christ
        // normal avenues weren't working due ot private assignment
        // cloning a new object but adding the addition elements as the parameteres actually worked
   
        Money newMoney = new Money(euros+addition.euros,cents+addition.cents);
        
        return newMoney;
    }
    public boolean lessThan(Money compared){
        Money newMoney = new Money(euros,cents);
        
        if (newMoney.euros < compared.euros){
            return true;
        } else if (newMoney.euros == compared.euros && newMoney.cents < compared.cents){
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser){
        Money newMoney = new Money (euros,cents);

        if (decreaser.cents>0){
            if (newMoney.euros - decreaser.euros < 0){
                newMoney = new Money (0,0); 
            } else newMoney = new Money (euros-decreaser.euros-1, 100-decreaser.cents);
            
        }else{
            if (newMoney.euros - decreaser.euros < 0){
                newMoney = new Money (0,0); 
            }else newMoney = new Money (euros-decreaser.euros, cents-decreaser.cents);

        }   
        return newMoney;
    }
}
