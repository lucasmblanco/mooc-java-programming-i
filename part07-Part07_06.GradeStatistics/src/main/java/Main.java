
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRoom newGradeRoom = new GradeRoom();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        //System.out.println("Enter point totals, -1 stops:");
        UserInterface newUserInterface = new UserInterface(scanner, newGradeRoom);
        newUserInterface.start();
        newUserInterface.showAverage();
        newUserInterface.showPassingGradeAverage();
        newUserInterface.showPassPercentage();
        newUserInterface.showGradeDistribution();

    }


}
