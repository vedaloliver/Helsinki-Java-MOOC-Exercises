public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        int total = num1+num2+num3+num4;
        return total;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
}
