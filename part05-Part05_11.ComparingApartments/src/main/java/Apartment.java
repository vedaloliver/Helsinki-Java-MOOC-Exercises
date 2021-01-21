
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (compared.squares <this.squares){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int two = compared.squares * compared.princePerSquare;
        int one = this.squares * this.princePerSquare;
        int result = 0;
        if (two-one<0){
            result = two-one;
            result = result *=-1;
        }else{
            result = two-one;
        }
        
        return result;
    }
    public boolean moreExpensiveThan(Apartment compared){
        // ohhhhhhhgh is moreexpesnivethan (one) more expensive than compared(two)
        int two = compared.squares * compared.princePerSquare;
        int one = this.squares * this.princePerSquare;
        if (two<one){
            return true;
        }else{
            return false;
        }
    }

}
