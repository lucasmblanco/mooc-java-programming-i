
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }

        String phrase = "The collection " + this.name + " has " + this.elements.size() + (this.elements.size() > 1 ? " elements:" : " element:");
        StringBuilder stringList = new StringBuilder();

        for (String e : elements) {
           if(elements.size() < 2){
               stringList.append(e);
               break;
           }
            stringList.append(e).append("\n");
        }

        return phrase + "\n" + stringList;
    }
}