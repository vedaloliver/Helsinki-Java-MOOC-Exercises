
public class AdvancedAstrology {

    public static void printStars(int number) {
        int begin = 0;
        while (begin<number){
            System.out.print("*");
            begin++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        int begin = 0;
        while (begin<number){
            System.out.print(" ");
            begin++;
        }
    }

    public static void printTriangle(int size) {
        int start = 1;
        while (start<=size){
            printSpaces(size-start);
            printStars(start);
            start++;
        }
    }    

    public static void christmasTree(int height) {
        int start = 1;
        int num = 1;
        while (start<=height){
            printSpaces (height-start);
            printStars(num);
            num = num + 2;
            start++;
        }
        
        for (int i = 1; i<=2; i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
