import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String userInput = scanner.nextLine();
            if(userInput.equals("X")){
                break;
            }
            if(userInput.equals("1")){
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            }
            if(userInput.equals("2")){
                System.out.println(jokeManager.drawJoke());
            }
            if(userInput.equals("3")){
                jokeManager.printJokes();
            }
        }
    }
}
