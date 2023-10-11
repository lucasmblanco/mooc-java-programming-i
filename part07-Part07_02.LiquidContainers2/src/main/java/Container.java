public class Container {
    private int storage;

    public Container(){
        this.storage = 0;
    }

    public int contains(){
        return this.storage;
    }

    public void add(int value){
        if(value > 0){
            if(this.storage + value > 100){
                this.storage = 100;
            } else {
                this.storage += value;
            }
        }
    }

    public void remove(int value){
        if(value > 0){
            if(this.storage - value < 0){
                this.storage = 0;
            } else {
                this.storage -= value;
            }
        }
    }
    public String toString(){
        return this.storage + "/100";
    }
}
