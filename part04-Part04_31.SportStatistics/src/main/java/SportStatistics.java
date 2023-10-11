
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int matchCount = 0;
        int winsCount = 0;
        int lossCount = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String matchInfo = fileScanner.nextLine();
                String[] matchInfoArr = matchInfo.split(",");
                if(matchInfoArr[0].equals(teamName)){
                    matchCount++;
                    if(Integer.parseInt(matchInfoArr[2]) > Integer.parseInt(matchInfoArr[3])) {
                        winsCount++;
                    } else {
                        lossCount++;
                    }
                }
                if( matchInfoArr[1].equals(teamName)){
                    matchCount++;
                    if(Integer.parseInt(matchInfoArr[2]) < Integer.parseInt(matchInfoArr[3])) {
                        winsCount++;
                    } else {
                        lossCount++;
                    }
                }


            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + matchCount);
        System.out.println("Wins: " + winsCount);
        System.out.println("Losses: " + lossCount);
    }

}
