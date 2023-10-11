
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);
            if(command.equals("add")){
                   first.add(value);
            }
            if(command.equals("move")){
                if (value <= 0 || first.contains() == 0) {
                    return;
                }
                if (first.contains() - value < 0) {
                    value = first.contains();
                }
                first.remove(value);
                second.add(value);

            }
            if(command.equals("remove")){
                   second.remove(value);
            }


        }

    }

}
