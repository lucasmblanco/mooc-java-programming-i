
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        return new Money((this.euros() + addition.euros()), (this.cents() + addition.cents()));
    }
//-350 100 - 150 100 - 100 150 - -350 100 - 400 100
    public boolean lessThan(Money compared){
       if(euros() == compared.euros()){
           return cents() < compared.cents();
       }
        return euros() < compared.euros();
    }

    public Money minus(Money decreaser){
        if(euros() - decreaser.euros() < 0){
            return new Money(0,0);
        }
        if(cents() - decreaser.cents() < 0){
            int newEur = euros() - decreaser.euros();
            int newCents = 100;
            newCents -= decreaser.cents;
            newEur--;
            return new Money(newEur, newCents);
        }
        return new Money(euros() - decreaser.euros(), cents() - decreaser.cents());
    }
}
