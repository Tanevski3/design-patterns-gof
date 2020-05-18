package com.mtanevski.designpatterns.gof.singleton.v1;

public class Database {

    private static Database database;

    private Database(){
        connect();
    }

    private void connect() {
        System.out.println("Connecting to DB");
    }

    public static Database getInstance(){
        if(database == null) {
            database = new Database();
        }
        return database;
    }
}
