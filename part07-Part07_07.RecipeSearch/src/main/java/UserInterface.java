import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    private RecipeCollection recipeCollection;

    public UserInterface(Scanner scanner, RecipeCollection recipeCollection){
        this.scanner = scanner;
        this.recipeCollection = recipeCollection;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
              createRecipes(fileScanner);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        userCommands();


    }

    public void userCommands(){
        label:
        while(true){
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            String input = scanner.nextLine();
            switch (input) {
                case "stop":
                    break label;
                case "list":
                    showList();
                    break;
                case "find name":
                    findName();
                    break;
                case "find cooking time":
                    findCookingTime();
                    break;
                case "find ingredient":
                    findByIngredient();
                    break;
            }
        }
    }
    public void showList(){
        ArrayList<Recipe> recipes = recipeCollection.getRecipes();
        for(Recipe r : recipes){
            System.out.println(r.showRecipe());
        }
    }

    public void findName(){
        System.out.print("Searched word: ");
        String word = scanner.nextLine();
        for(Recipe r : recipeCollection.getRecipes()){
            if(r.getName().contains(word)){
                System.out.println(r.showRecipe());

            }
        }
    }

    public void findCookingTime(){
        System.out.println("Max cooking time: ");
        int time = Integer.parseInt(scanner.nextLine());
        for(Recipe r : recipeCollection.getRecipes()){
            if(r.getCookingTime() <= time){
                System.out.println(r.showRecipe());
            }
        }
    }

    public void findByIngredient(){
        System.out.println("Ingredient: ");
        String ing = scanner.nextLine();
        ArrayList<Recipe> recipes = recipeCollection.getRecipes();
        for(Recipe r : recipes){
            if(r.getIngredients().contains(ing)){
                System.out.println(r.showRecipe());
            }
        }
    }
    public void createRecipes(Scanner fileScanner){
        while(fileScanner.hasNext()){
            ArrayList<String> ingredients = new ArrayList<>();
            String name = fileScanner.nextLine();
            int duration = Integer.parseInt(fileScanner.nextLine());
            while(fileScanner.hasNextLine()){
                String ingredient = fileScanner.nextLine();
                ingredients.add(ingredient);
                if(ingredient.isEmpty()){
                    break;
                }
            }
            recipeCollection.addRecipe(new Recipe(name, duration, ingredients));
        }
    }
}
