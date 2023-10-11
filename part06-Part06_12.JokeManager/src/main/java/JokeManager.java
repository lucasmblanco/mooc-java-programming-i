import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke){
        jokes.add(joke);
    }

    public String drawJoke(){
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();

        int randomIndex = draw.nextInt(jokes.size()); //random index from 0 to jokes length/size

        return jokes.get(randomIndex);

    }

    public void printJokes(){
        for(String j : jokes){
            System.out.println(j);
        }
    }
}
