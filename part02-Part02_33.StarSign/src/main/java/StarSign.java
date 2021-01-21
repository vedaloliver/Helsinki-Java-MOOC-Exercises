
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(4);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(5);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int begin = 0;
        while (begin<number){
            System.out.print("*");
            begin++;
        }
        System.out.println("");


            
    }
    public static void printSquare(int size) {
        int start = 1;
        while (start<=size){
            printStars(size);
            start ++;
        }
    }

    public static void printRectangle(int width, int height) {
        int start = 1;
        while (start<=height){
            printStars(width);
            start++;
        }
        
    }

    public static void printTriangle(int size) {
        int start = 1;
        while (start<=size){
            printStars(start);
            start++;
        }
         
    }
}
