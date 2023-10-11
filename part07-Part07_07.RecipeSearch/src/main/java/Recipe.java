import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }

    public String showRecipe() {
       return this.name + ", " + "cooking time: " + this.cookingTime;
    }
}
