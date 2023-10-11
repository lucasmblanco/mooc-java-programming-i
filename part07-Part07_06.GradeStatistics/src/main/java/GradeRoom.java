import java.util.ArrayList;

public class GradeRoom {
    private ArrayList<Integer> points;
    //Integer totalPoints;


    public GradeRoom(){
        this.points = new ArrayList<>();
        //this.totalPoints = 0;
    }

    public void addPoints(Integer point){
        if(point >= 0 && point <= 100){
            this.points.add(point);
        }
    }

    public Integer getTotal(){
        int total = 0;
        for(Integer p : points){
            total += p;
        }
        return total;
    }

    public Integer getQuantityMoreThan50(){
        int qnty = 0;
        for(Integer p : points){
            if(p >= 50){
                qnty++;
            }
        }
        return qnty;
    }
    public Integer getTotalMoreThan50(){
        int total = 0;
        for(Integer p : points){
            if(p >= 50){
                total += p;
            }
        }
        return total;
    }

    public double calculateAverage(){
        return ((double) getTotal() / points.size());
    }

    public double calculatePassingGradeAverage(){
       return (double) getTotalMoreThan50() / getQuantityMoreThan50();
    }

    public double calculatePassPercentage(){
        return (100 * ((double) getQuantityMoreThan50() / points.size()));

    }

    public void gradeDistribution(){
        ArrayList<Grade> gradesArr = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            gradesArr.add(new Grade(i));
        }

        for(Integer p: points){
            if(p < 50){
                gradesArr.get(0).addQuantity();
            } else if(p < 60){
                gradesArr.get(1).addQuantity();
            } else if(p < 70){
                gradesArr.get(2).addQuantity();
            } else if( p < 80){
                gradesArr.get(3).addQuantity();
            } else if( p < 90){
                gradesArr.get(4).addQuantity();
            } else {
                gradesArr.get(5).addQuantity();
            }
        }

        for(Grade grade : gradesArr){
            grade.printStars();
        }

    }
}
