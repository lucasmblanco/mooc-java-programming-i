
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean isFound = false;

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            while(fileScanner.hasNextLine()){
                String name = fileScanner.nextLine();
                if(searchedFor.equals(name)){
                    System.out.println("Found!");
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("Not found!");
            }

        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }



    }
}
