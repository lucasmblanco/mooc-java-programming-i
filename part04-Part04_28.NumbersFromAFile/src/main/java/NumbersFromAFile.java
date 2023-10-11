
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());
        int count = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                int value = Integer.parseInt(fileScanner.nextLine());
                if(value >= lowerBound && value <= upperBound){
                    count++;
                }
            }
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Numbers: " + count);
    }

}
