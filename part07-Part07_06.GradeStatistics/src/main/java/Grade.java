import java.util.ArrayList;
import java.util.StringJoiner;

public class Grade {
    private int number;
    private int quantity;
    private String stars;

    public Grade(int number){
        this.number = number;
        this.quantity = 0;
        this.stars = "";
    }

    public int getNumber() {
        return number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(){
        this.quantity++;
        this.stars += "*";
    }

    public void printStars(){
        System.out.println(this.number + ": " + this.stars);
    }
}
