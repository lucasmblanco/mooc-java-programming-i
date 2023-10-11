import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private int partialWeight;
    private ArrayList<Item> suitcaseList;

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcaseList = new ArrayList<>();
        this.partialWeight = 0;
    }

    public int totalWeight(){
        int total = 0;
        for(Item item : suitcaseList){
            total += item.getWeight();
        }
        return total;
    }

    public void addItem(Item item){
        this.partialWeight += item.getWeight();
        if(this.partialWeight > this.maximumWeight) {
            this.partialWeight -= item.getWeight();
            return;
        }
        this.suitcaseList.add(item);
    }

    public String toString(){
        if(suitcaseList.isEmpty()){
            return "no items (0 kg)";
        }
        if(suitcaseList.size() < 2){
            return "1 item (" + totalWeight() + " kg)";
        }
        return this.suitcaseList.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems(){
        StringBuilder list = new StringBuilder();
        for(Item item : suitcaseList){
            if(suitcaseList.size() < 2){
                System.out.println(list.append(item));
                break;
            }
            System.out.println(list.append(item).append("\n"));
        }
       // return list.toString();
    }

    public Item heaviestItem(){
        if(this.suitcaseList.isEmpty()){
            return null;
        }
        Item heaviest = this.suitcaseList.get(0);

        for(Item item : suitcaseList){
            if(heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }

        return heaviest;

    }



}
