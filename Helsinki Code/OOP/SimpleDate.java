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

        if (this.year > compare.year){
            return false;
        }

        if (this.month < compare.month){
            return true;
        }

        if (this.month > compare.month){
            return false;
        }

        if (this.day < compare.day){
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

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}
