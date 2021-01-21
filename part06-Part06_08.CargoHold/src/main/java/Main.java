public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 9);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 10);
        

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        

        Hold hold = new Hold(20);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
    }
}