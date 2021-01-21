
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int total = number1+number2+number3+number4;
        return total;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double  average = (double) (sum(number1,  number2,  number3,  number4));
        return average/4;
    }

    public static void main(String[] args) {
        double result = average(1,3 , 5, 1);
        System.out.println("Average: " + result);
       
    }
}
