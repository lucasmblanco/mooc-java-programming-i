import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private int partialWeight;
    private ArrayList<Suitcase> holdContainer;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.holdContainer = new ArrayList<>();
    }

    public int totalWeight(){
        int total = 0;
        for(Suitcase suitcase : holdContainer){
            total += suitcase.totalWeight();
        }
        return total;
    }
    public void addSuitcase(Suitcase suitcase){
        this.partialWeight += suitcase.totalWeight();
        if(this.partialWeight > this.maximumWeight){
            this.partialWeight -= suitcase.totalWeight();
            return;
        }
        holdContainer.add(suitcase);
    }

    public String toString(){
        if(holdContainer.isEmpty()){
            return "no suitcase (0 kg)";
        }
        if(holdContainer.size() < 2){
            return "1 suitcase (" + totalWeight() + " kg)";
        }
        return this.holdContainer.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems(){

        for(Suitcase suitcase : holdContainer){
            suitcase.printItems();
        }
    }
}
