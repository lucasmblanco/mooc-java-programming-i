import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRoom gradeRoom;

    public UserInterface(Scanner scanner, GradeRoom gradeRoom){
        this.scanner = scanner;
        this.gradeRoom = gradeRoom;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int point = Integer.parseInt(scanner.nextLine());
            if(point == -1){
                break;
            }
            if(point >= 0 && point <= 100){
                this.gradeRoom.addPoints(point);
            }
        }
    }

    public void showAverage(){
        System.out.println("Point average (all): " + this.gradeRoom.calculateAverage());
    }

    public void showPassingGradeAverage(){
        System.out.println("Point average (passing): " + this.gradeRoom.calculatePassingGradeAverage());
    }

    public void showPassPercentage(){
        System.out.println("Pass percentage: " + this.gradeRoom.calculatePassPercentage());
    }

    public void showGradeDistribution(){
        this.gradeRoom.gradeDistribution();
    }


}
