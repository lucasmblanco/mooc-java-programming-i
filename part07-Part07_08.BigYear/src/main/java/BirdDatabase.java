import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> database;

    public BirdDatabase(){
        this.database = new ArrayList<>();
    }

    public ArrayList<Bird> getDatabase() {
        return database;
    }

    public void addBird(Bird bird){
        database.add(bird);
    }
}
