
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        this.day++;
        if(this.day > 30){
            this.month++;
            this.day = 1;
        }

        if(this.month > 12){
            this.year++;
            this.month = 1;
        }
    }

    public void advance(int howManyDays){
        this.day += howManyDays;

        if(this.day > 30){
            this.month++;
            this.day -= 30;
        }

        if(this.month > 12){
            this.year++;
            this.month = 1;
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        int monthsNewDate = this.month;
        int yearsNewDate = this.year;
        int daysNewDate = this.day;
        int i = 0;

        while(i < days){
            daysNewDate++;
            if(daysNewDate > 30){
                monthsNewDate++;
                if(monthsNewDate > 12){
                    yearsNewDate++;
                    monthsNewDate = 1;
                }
                daysNewDate = 1;
            }
            i++;
        }

        return new SimpleDate(daysNewDate, monthsNewDate, yearsNewDate);
    }

}
