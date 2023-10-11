import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.todoList = list;
        this.scanner = scanner;
    }

    public void start(){
        label:
        while(true){
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "stop":
                    break label;
                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int position = Integer.parseInt(scanner.nextLine());
                    todoList.remove(position);
                    break;
            }
        }
    }
}
