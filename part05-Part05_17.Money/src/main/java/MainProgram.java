
public class MainProgram {

    public static void main(String[] args) {
Money a = new Money(10, 0);
Money b = new Money(11, 40);

Money c = a.minus(b);

System.out.println(a);  // 10.00e
System.out.println(b);  // 3.50e
System.out.println(c);  // 6.50e

    }
}
