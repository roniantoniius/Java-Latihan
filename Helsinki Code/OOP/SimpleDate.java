package OOP;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public boolean before(SimpleDate compare){
        if (this.year < compare.year){
            return true;
        }

        if (this.year == compare.year && this.month < compare.month) {
            return true;
        }

        if (this.year == compare.year && this.month == compare.month &&
            this.day < compare.day) {
            return true;
        }

        return false;
    }

    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }

        if (!(compare instanceof SimpleDate)){
            return false;
        }

        SimpleDate compareSimpleDate = (SimpleDate) compare;

        if (this.day == compareSimpleDate.day &&
            this.month == compareSimpleDate.month &&
            this.year == compareSimpleDate.year){
            return true;
        }

        return false;
    }

    public void advance(){
        if (this.day == 30){
            this.day = 1;
            if (this.month == 12){
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

    public void advance(int howManyDays){
        for (int i = 0; i < howManyDays; i++){
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}
