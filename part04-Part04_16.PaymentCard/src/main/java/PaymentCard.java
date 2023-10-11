public class PaymentCard {
    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public void eatAffordably(){
        if(this.balance - 2.60 < 0){
            return;
        }
        this.balance -= 2.60;
    }

    public void eatHeartily(){
        if(this.balance - 4.60 < 0){
            return;
        }
        this.balance -= 4.60;
    }

    public void addMoney(double money){
        if(money < 0){
            return;
        }
        if(this.balance + money > 150.0){
            this.balance = 150.0;
            return;
        }
        this.balance += money;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
