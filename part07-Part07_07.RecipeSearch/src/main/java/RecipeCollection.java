import java.util.ArrayList;

public class RecipeCollection {
    private ArrayList<Recipe> recipes;

    public RecipeCollection(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
