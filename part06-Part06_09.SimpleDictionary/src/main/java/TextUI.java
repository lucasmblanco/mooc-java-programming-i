import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        label:
        while(true){
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "end":
                    System.out.println("Bye Bye");
                    break label;
                case "add": {
                    System.out.print("Word: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    simpleDictionary.add(word, translation);
                    break;
                }
                case "search": {
                    System.out.println("To be translated: ");
                    String word = scanner.nextLine();
                    if (simpleDictionary.translate(word) == null) {
                        System.out.println("Word " + word + " was not found");
                    } else {
                        System.out.println("Translation " + simpleDictionary.translate(word));
                    }
                    break;
                }
                default:
                    System.out.println("Unknown command");
                    break;
            }

        }
    }
}
