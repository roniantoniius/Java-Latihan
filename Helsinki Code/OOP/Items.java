package OOP;

import java.sql.Date;

public class Items {
    private String name;
    private Date date;

    public Items(String name){
        this.name = name;
        this.date = new Date(System.currentTimeMillis());
    }

    public String toString(){
        return this.name + " dibuat pada " + this.date;
    }
}
