import java.util.ArrayList;

public class Room {
    private ArrayList<Person> roomList;

    public Room(){
        this.roomList = new ArrayList<>();
    }

    public void add(Person person){
        this.roomList.add(person);
    }

    public boolean isEmpty(){
        return this.roomList.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return roomList;
    }

    public Person shortest(){
        if(roomList.size() == 0){
            return null;
        }
        Person shortest = this.roomList.get(0);

        for(Person p : roomList){
            if(shortest.getHeight() > p.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }

    public Person take(){
        if(roomList.size() == 0){
            return null;
        }
        Person shortest = shortest();
        roomList.remove(shortest);
        return shortest;
    }
}
