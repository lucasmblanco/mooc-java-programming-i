import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner, BirdDatabase database){
        this.scanner = scanner;
        this.database = database;
    }

    public void start(){

        label:
        while(true){
            System.out.print("? ");
            String input = scanner.nextLine();
            switch (input) {
                case "Quit":
                    break label;
                case "Add":
                    addBird();
                    break;
                case "Observation":
                    addObservation();
                    break;
                case "All":
                    showAll();
                    break;
                case "One":
                    showOne();
                    break;
            }
        }
    }

    public void addBird(){
        System.out.println("Name: ");
        String birdName = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();
        database.addBird(new Bird(birdName, latinName));
    }

    public void addObservation(){
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        for(Bird bird : database.getDatabase()){
            if(bird.getCommonName().equals(name)){
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void showAll(){
        for(Bird bird : database.getDatabase()){
            System.out.println(bird.toString());
        }
    }

    public void showOne(){
        System.out.print("Bird ");
        String birdName = scanner.nextLine();
        for(Bird bird : database.getDatabase()){
            if(bird.getCommonName().equals(birdName)){
                System.out.println(bird.toString());
                break;
            }
        }
    }
}
