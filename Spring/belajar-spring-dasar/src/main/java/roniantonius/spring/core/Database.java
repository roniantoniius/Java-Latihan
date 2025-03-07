package roniantonius.spring.core;

public class Database {
    private static Database database;
    static Database getInstance(){
        if (database == null) {database = new Database();}
        return database;
    }
    private Database(){

    }
}
