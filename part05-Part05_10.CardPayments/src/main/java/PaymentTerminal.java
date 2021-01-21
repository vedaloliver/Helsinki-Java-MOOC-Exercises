
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment>= 2.50){
            this.money += 2.50;
            affordableMeals += 1;
            return payment - 2.50;
        }
        
   
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment>= 4.30){
            this.money += 4.30;
            heartyMeals += 1;
            return payment - 4.30;
        }
        
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card){
        if (card.balance() >= 2.50){
            affordableMeals+=1;
            card.takeMoney(2.50);
            return true;
            
        }
        return false;
    }
    public boolean eatHeartily(PaymentCard card){
        if (card.balance() >= 4.30){
            heartyMeals += 1;
            card.takeMoney(4.30);
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
            if (sum>0){
                card.addMoney(sum);
                this.money+=sum;
        }
    }
    


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
