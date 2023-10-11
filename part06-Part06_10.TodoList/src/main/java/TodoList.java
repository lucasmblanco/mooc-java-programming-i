import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist;

    public TodoList(){
        this.todolist = new ArrayList<>();
    }

    public void add(String task){
        todolist.add(task);
    }

    public void print(){
     int index = 1;
     for(String task : todolist){
         System.out.println(index + ": " + task);
         index++;
     }
    }

    public void remove(int position){
        todolist.remove(position - 1);
    }
}
