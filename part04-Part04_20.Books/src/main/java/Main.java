import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(name, pages, year));
        }

        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if(input.equals("name")){
            for(Book book : bookList){
                System.out.println(book.getName());
            }
        } else if(input.equals("everything")){
            for(Book book : bookList){
                System.out.println(book.toString());
            }
        }
     }
}
