
public class YourFirstAccount {

    public static void main(String[] args) {
        Account bank = new Account("Oliver's account", 100.0);
        bank.deposit(20.0);
        System.out.println(bank);
    }
}
