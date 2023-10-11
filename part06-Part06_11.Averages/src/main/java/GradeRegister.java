
import java.util.ArrayList;
import java.util.Iterator;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private static ArrayList<Integer> pointList;
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        pointList.add(points);
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int total = 0;
        for(int g: grades){
            total += g;
        }

        return (double) total / grades.size();
    }

    public double averageOfPoints(){
        if(pointList.isEmpty()){
            return -1;
        }
        int total = 0;
        for(int p: pointList){
            total += p;
        }

        return (double) total / pointList.size();
    }
}
