
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matt = new Account("Matthews account", 1000.0);
        Account Mine = new Account("My account", 0.0);
        Matt.withdrawal(100);
        Mine.deposit(100);
        System.out.println(Matt);
        System.out.println(Mine);
        
    }
}
