
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);


            if(value > 0){
                if(command.equals("add")){
                    if(first + value > 100){
                            first = 100;
                        } else {
                            first += value;
                        }
                }
                if(command.equals("move")){
                    if(first < value){
                        if(second + first > 100){
                            second = 100;
                        } else {
                            second += first;
                        }
                        first = 0;
                    } else {
                        if(second + value > 100){
                            second = 100;
                        } else {
                            first -= value;
                            second += value;
                        }
                    }
                }
                if(command.equals("remove")){
                    if(second - value < 0){
                        second = 0;
                    } else {
                        second -= value;
                    }
                }
            }

        }

    }

}
