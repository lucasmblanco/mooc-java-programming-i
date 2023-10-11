import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement(){
        this.exercises = new ArrayList<>();

    }
    public ArrayList<String> exerciseList(){
       ArrayList<String> list = new ArrayList<>();
       for(Exercise e : exercises){
           list.add(e.getName());
        }

       return list;
    }

    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise){
        for(Exercise e : exercises){
            if(e.getName().equals(exercise)){
                e.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise){
        for(Exercise e : exercises){
            if(e.getName().equals(exercise)){
               return e.isCompleted();
            }
        }
        return false;
    }

    public void deleteExercise(String exercise){
        int index = 0;
        for(Exercise e : exercises){
            if(e.getName().equals(exercise)){
                break;
            }
            index++;
        }
        exercises.remove(index);
    }
}
