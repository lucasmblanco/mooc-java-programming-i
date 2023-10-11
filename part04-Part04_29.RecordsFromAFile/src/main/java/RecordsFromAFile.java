
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();


        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String fullInfo = fileScanner.nextLine();
                String[] infoArr = fullInfo.split(",");
                String name = infoArr[0];
                String age = "age: " + infoArr[1] + (Integer.parseInt(infoArr[1]) == 1 ? " year" : " years");
                System.out.println(name + ", " + age);
            }

        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
